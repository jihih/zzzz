#include <stdio.h>

void show_arr(int a[]);

int main()
{
	// 1.�迭 ������ �Ű������� �����ϴ� ���
	// 2.��������, �������� ���� ���� �� Ȱ��
	// 3.Call by Value(���� ���� ����)
	// 4.Call by Address(�ּҰ��� ���� ����)
	
	// �迭: ������ �����Ҽ��ִ� �������� ����
	int arr[10]; // �������� 10�� ������ �� �ִ� �迭 ���� arr
	int a;       // �������� 1���� �����ϴ� �Ϲ� ���� a 

	// 1~10������ arr�迭�� ����
	for (int i = 0; i < 10; i++) {
		arr[i] = i + 1;
	}
	show_arr(arr);
}

void show_arr(int a[]) // �迭 ũ�Ⱑ �󸶵� ���� ��ĭ���� �α�
{
	// main���� ���� �迭�� �� �Լ����� ���
	// arr�迭 ������ �ּҰ��� �Ű������� ����
	for (int i = 0; i < 10; i++) {
		printf("a[%d]=%d\n", i, a[i]);
	}
}