/*
(문제7)
배열의 크기를 입력받고, 이후 N개의 정수를 두 번 입력받아, 
예시와 같이 역방향으로 더하여 출력하는 프로그램을 작성하시오.
(↦ 이후는 입력 및 출력에 대하 설명이고, □는 공백을 의미)

입력 예시1
3     ↦ 배열 크기 N=3
1 2 3
5 10 15

출력 예시1
□16 12 8  ↦ 16=1+15, 12=2+10, 8=3+5

입력 예시2
4       ↦ 배열 크기 4
3 8 9 5
0 1 -5 6

출력 예시2
□9 3 10 5

※ 주의: 문제 명세에서 N의 크기에 제한을 두지 않았음에 주의하라.
(도움말: 필요한 배열은 동적할당 받아 사용하여야 함)
*/

import java.util.Scanner;   //Scanner불어옴

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);    //Scanner 여기서 쓸거임
		
		int a = sc.nextInt();                   //a scanf
		int[] b = new int[100];                 //배열 선언
		int[] c = new int[100];
		
		
		for(int i=0;i<a;i++) {
			b[i] = sc.nextInt();
			 
		}
		for(int j=0;j<a;j++) {
			c[j] = sc.nextInt();
			
		}
		for(int k=0;k<a;k++) {
			System.out.print (b[k] + c[a-k-1] + " " );
		}
		scanner.close();
	}
}
