/* Class Name must be 'Main' */
/*
[ 예시문제 ] 
배열에 5개의 정수를 입력 받아서 저장하시오.
  - 5개의 평균보다 큰 정수를 모두 출력하시오.

입력예시1
1 1 1 10 10

출력예시1
10
10
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;

        // 5개의 정수를 입력받아 배열에 저장하고 합계를 계산
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        double average = sum / 5.0;

        // 평균보다 큰 값을 출력
        for (int i = 0; i < 5; i++) {
            if (nums[i] > average) {
                System.out.println(nums[i]);
            }
        }

        sc.close();
    }
}
