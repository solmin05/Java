/*
[ 예시문제 ] 
배열에 7개의 문자를 입력 받아서 저장하시오.
문자 중에서 cat가 몇 번 있는지 횟수를 출력하시오. 
cat 가 이어진 경우만 찾는다.

입력예시1
catbcat

출력예시1
2
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();  // 7개의 문자 입력 받기

        int count = 0;

        // "cat"이 연속해서 나오는 횟수 세기
        for (int i = 0; i <= input.length() - 3; i++) {
            if (input.substring(i, i + 3).equals("cat")) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
