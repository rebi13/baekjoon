package Baekjoon;

import java.util.Scanner;

public class UnderArmor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scan.nextInt(); // 팀의 수
		int K = scan.nextInt(); // 팀원 3명의 레이팅 합에 대한 클럽 가입 조건
		int L = scan.nextInt(); // 개인 레이팅에 대한 클럽 가입 조건
		int x1 = 0; int x2 = 0;  int x3 = 0; // 팀원의 각각의 레이팅 점수
		int K_sum = 0;
		int j = 0; // 가입 가능한 팀의 수
		
		for(int i=0; i<N; i++) { // 팀의 수만큼 팀원의 레이팅 입력
			x1 = scan.nextInt();
			x2 = scan.nextInt();
			x3 = scan.nextInt();
			K_sum = x1 + x2 + x3; // 팀원 3명의 레이팅 합
			if(K_sum >= K && x1 >= L && x2 >= L && x3 >= L)
			{
				sb.append(x1 + " " + x2 + " " + x3 + " ");
				j++;
			}
		}
		
		System.out.println(j); // 가입 가능한 팀의 수 출력
		System.out.println(sb); // 가입 가능한 팀원의 레이팅 점수 출력
		scan.close();
	}

}
