/*
[ 문제 ] 
배열에 10개의 숫자를 입력 받아서 저장하시오.
  - 숫자는 1 혹은 2 혹은 3 중의 하나이다.
  - 각 숫자의 개수 만큼 별표를 출력하시오.

입력예시1
1 1 1 2 2 2 3 3 3 3

출력예시1
1:***
2:***
3:****
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10]; // 입력 받을 숫자들을 저장할 배열 생성

        // 10개의 숫자 입력 받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // 숫자별로 '*' 출력
        for (int num = 1; num <= 3; num++) { // 입력 범위가 1부터 3까지로 가정
            System.out.print(num + ": "); 
            for (int i = 0; i < 10; i++) { 
                if (arr[i] == num) { 
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
