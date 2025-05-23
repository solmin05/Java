/*[ 예시문제 ] 
사용자에게서 총 9개의 숫자를 입력 받아, 
3 X 3 배열을 초기화 하시오. 
3 X 3 배열에서 대각선 원소들의 합을 출력하시오.

입력예시1
1 2 3
4 5 6
7 8 9

출력예시1
15

(위 예에서 대각선은 1, 5, 9 이고 그 합은 15 이다)
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 왼쪽 위 → 오른쪽 아래 대각선 합
        for (int i = 0; i < 3; i++) {
            sum += arr[i][i]; 
        }

        
        System.out.println(sum);

        sc.close();
    }
}
