/*
[ 문제 ] 
영어 문자 다섯 개를 입력 받아서,  
예시와 같이 한 번에 한 칸씩 shift해서 
출력하는 프로그램을 작성하시오.

입력예시1
*abcd

출력예시1
*abcd
d*abc
cd*ab
bcd*a
abcd*
*/
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    char arr[] = new char[5]; //배열 5개 선언 
	    String s = scanner.next(); //문자열 받는거 
	    
	    for(int i=0;i<5;i++){
	        arr[i] = s.charAt(i);
	    }
        // 입력받은 문자열을 한 칸씩 오른쪽으로 shift하여 출력
        for (int i = 5; i > 0; i--) {
            // 한 칸씩 오른쪽으로 shift하여 출력
            for (int j = 0; j < 5; j++) {
                int newIndex = (j + i) % 5; // 오른쪽으로 한 칸씩 shift한 인덱스 계산
                System.out.print(arr[newIndex]);
            }
            System.out.println(); // 다음 줄로 이동
        }

        scanner.close(); // Scanner 객체 닫기
    }
}
