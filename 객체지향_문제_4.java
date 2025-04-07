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
