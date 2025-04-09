/*
 [ 예시문제 ]  
배열에 5개의 정수를 입력 받아서 저장하시오.
  - [ 이전문제 ]의 작업을 N-1번 반복하여, 
    가장 작은 수부터 가장 큰 수까지 
    오름차순으로 정렬하시오. 
    여기서 N=5 이다.

입력예시1
5 4 3 2 1

출력예시1
1
2
3
4
5
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        // 5개 숫자 입력 받기
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }

        // 버블 정렬 (N-1번 반복)
        for (int i = 0; i < 4; i++) { // N-1번 반복
            for (int j = 0; j < 4 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // 정렬된 결과 출력
        for (int num : nums) {
            System.out.println(num);
        }

        scanner.close();
    }
}
