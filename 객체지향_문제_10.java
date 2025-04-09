/*
[ 문제 ] 
사용자에게서 0~5 까지의 숫자 세 개를 입력 받아,  
각 숫자에 해당하는 영어를 출력하시오.
  - 2차원 배열을 사용하시오.  char x[6][5] = { 'Z', 'E', 'R', 'O', '-', 'O', 'N', … };

입력숫자  영어 (다섯 글자) 출력
    0                  ZERO-
    1                  ONE--
    2                  TWO--
    3                  THREE
    4                  FOUR-
    5                  FIVE-

입력예시1
1 3 5

출력예시1
ONE--
THREE
FIVE-
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    char[][]x = {        
            {'Z', 'E', 'R', 'O', '-'},
            {'O', 'N', 'E', '-', '-'},
            {'T', 'W', 'O', '-', '-'},
            {'T', 'H', 'R', 'E', 'E'},
            {'F', 'O', 'U', 'R', '-'},
            {'F', 'I', 'V', 'E', '-'}
        };
	    
	    for(int i=0;i<3;i++){ //for문을 사용하여 3번 반복 
	        int j = scanner.nextInt();
	        for(int k =0; k <5;k++){
	            System.out.print(x[j][k]);
	        }
	        System.out.println();
		}
	}
}
