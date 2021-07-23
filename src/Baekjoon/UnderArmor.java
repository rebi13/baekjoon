package Baekjoon;

import java.util.Scanner;

public class UnderArmor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scan.nextInt(); // ���� ��
		int K = scan.nextInt(); // ���� 3���� ������ �տ� ���� Ŭ�� ���� ����
		int L = scan.nextInt(); // ���� �����ÿ� ���� Ŭ�� ���� ����
		int x1 = 0; int x2 = 0;  int x3 = 0; // ������ ������ ������ ����
		int K_sum = 0;
		int j = 0; // ���� ������ ���� ��
		
		for(int i=0; i<N; i++) { // ���� ����ŭ ������ ������ �Է�
			x1 = scan.nextInt();
			x2 = scan.nextInt();
			x3 = scan.nextInt();
			K_sum = x1 + x2 + x3; // ���� 3���� ������ ��
			if(K_sum >= K && x1 >= L && x2 >= L && x3 >= L)
			{
				sb.append(x1 + " " + x2 + " " + x3 + " ");
				j++;
			}
		}
		
		System.out.println(j); // ���� ������ ���� �� ���
		System.out.println(sb); // ���� ������ ������ ������ ���� ���
		scan.close();
	}

}
