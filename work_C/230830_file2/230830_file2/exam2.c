#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>	// exit()
#include <time.h>	// time()

typedef struct _PERSON {
	char name[20];
	int age;
	char tel[20];
	char addr[50];
} PERSON;

int main_menu();
void write_person();
void read_person();

const char* name[] = { "홍길동", "전우치", "강감찬", "유관순", "이순신" };
const int age[] = { 20, 30, 40, 50, 60 };
const char* tel[] = { "010-1234-1234", "010-1234-1111", "010-1234-2222",
	"010-1234-3333", "010-1234-4444" };
const char* addr[] = { "대구 동구 신암4동", "서울 동구 신암4동" ,
	"광주 동구 신암4동", 	"대전 동구 신암4동", "부산 동구 신암4동" };

int main()
{
	

	srand(time(NULL));

	while (1) {
		switch (main_menu()) {
		case 1:
		{
			write_person();
			break;
		}
		case 2:
		{
			read_person();
			break;
		}
		case 3:
			printf("프로그램 종료\n");
			exit(0);
		default:
			printf("잘못된 메뉴 선택!!\n");
		}
	}

}

int main_menu()
{
	printf("---------------------------\n");
	printf("파일 제어 프로그램 v1.0\n");
	printf("---------------------------\n");
	printf("1.랜덤한 데이터 파일 입력\n");
	printf("2.랜덤한 데이터 파일 보기\n");
	printf("3.종료\n");
	printf("---------------------------\n");
	printf("메뉴 선택:");
	int menu;
	scanf("%d", &menu);
	return menu;
}

void write_person()
{
	PERSON per_arr[100] = { 0 };
	FILE* fp = fopen("friend2.bin", "wb");
	for (int i = 0; i < 100; i++) {
		strcpy(per_arr[i].name, name[rand() % 5]);
		strcpy(per_arr[i].tel, tel[rand() % 5]);
		strcpy(per_arr[i].addr, addr[rand() % 5]);
		per_arr[i].age = age[rand() % 5];
		fwrite(&per_arr[i], sizeof(per_arr[i]), 1, fp);
	}
	fclose(fp);
	printf("랜덤한 데이터가 파일에 저장되었습니다!\n");
}

void read_person()
{
	PERSON temp = { 0 };
	FILE* fp = fopen("friend2.bin", "rb");
	int cnt = 1;
	while (fread(&temp, sizeof(PERSON), 1, fp) == 1) {
		printf("번호:%d 이름:%s 나이:%d 전화:%s 주소:%s\n", cnt++,
			temp.name, temp.age, temp.tel, temp.addr);
	}
	fclose(fp);
}