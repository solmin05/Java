/*
[ 문제 ] 
하나의 양의 정수 N을 입력 받아, 1부터 N까지의 정수에서 숫자 3이 총 몇 번 나타나는지를 
출력하는 프로그램 작성하시오.  

  - 중첩 반복문 (for 문, while 문 사용)
  - N=33 일 때, 3, 13, 23, 30, 31, 32, 33, 총 7개의 수에서 8개의 3이 나타난다.
    (∵ 숫자 33에는 3이 두 개 있으므로) 

입력예시1
10

출력예시1
1

입력예시2
33

출력예시2
8

입력예시3
31323

출력예시3
13711
*/

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        int count = 0;

        for (int i = 1; i <= a; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 3) { // 1의 자리가 3인지 확인
                    count++;
                }
                temp /= 10; // 다음 자릿수 확인
            }
        }

        System.out.println(count);
        sc.close();
    }
}

	
