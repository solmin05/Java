/*
[ 예시문제 ] 
학생 3명의 국어, 영어 성적이 있다. 
  - 이 자료를 저장하기 위한 2차원 배열을 선언 하시오. 
  - 학생 별 국어와 영어 성적을 사용자로부터 입력 받으시오.
  - 학생 별 국어와 영어 성적의 합을 각각 출력하시오.

           국어      영어   
학생A      10          20
학생B      30          40
학생C      50          60

입력예시1
10 20 30 40 50 60

출력예시1 
30
70
110
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[3][2]; 

        for (int i = 0; i < 3; i++) {
            scores[i][0] = sc.nextInt(); 
            scores[i][1] = sc.nextInt(); 
        }

        for (int i = 0; i < 3; i++) {
            int sum = scores[i][0] + scores[i][1];
            System.out.println(sum);
        }

        sc.close();
    }
}
