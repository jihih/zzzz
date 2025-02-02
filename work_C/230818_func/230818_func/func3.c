#include <stdio.h>
int get_number();
char get_char();

int main()
{
	// 반환값의 데이터타입 함수명() -> 매개변수 x
	int n = get_number(); // return한 200의 값을 변수 n에 저장
	printf("리턴받은 값: %d\n", n);
	int b = get_char();
	printf("리턴받은 문자: %c\n", b);

	// 변수를 사용해서 리턴값을 받지 않고 직접 함수 리턴값을 %d에 전달
	printf("함수 리턴값: %c\n", get_char());
}

int get_number()
{
	int n = 200;
	return n; // 함수가 종료되기전에 return 값을 호출한 곳으로 되돌려줌
	          // 리턴값은 1개의 값만 가능
}

char get_char()
{
	char c = 'B';
	return c;
}