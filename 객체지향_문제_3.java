/*[ 문제 ] 
10이상의 양의 정수 N을 입력 받아 각 자리수의 합을 출력하는 프로그램을 작성하시오.

  - 예) 6234 -> 6+2+3+4=15

입력예시1
6234

출력예시1
15

입력예시2
123456789

출력예시2
45

입력예시3
40

출력예시3
4
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 10 이상의 양의 정수 입력
        int sum = 0;

        while (a > 0) {
            sum += n % 10;   // 마지막 자리 숫자를 더함
            a /= 10;         // 마지막 자리 제거
        }

        System.out.println(sum);
        sc.close();
    }
}
