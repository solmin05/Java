/*
[ 문제 ] 
사용자에게서 정수 다섯 개를 입력 받는다. 
첫 번째 큰 수와 두 번째 큰 수를 각각 출력하시오.

입력예시1
5 4 3 2 1

출력예시1
5
4

입력예시2
5 5 3 2 1

출력예시2
5 
5

입력예시3
-1 -2 -3 -4 -5

출력예시3
-1
-2
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];//배열 선언 
		
		for(int i=0;i<5;i++){ //for문을 사용하여 5번 반복 
		    arr[i] = scanner.nextInt(); // 배열에 입력한 값 저장 
		}
		
		Arrays.sort(arr);
		
		int firstLar = arr[4];
		int secondLar = arr[3];
		
		System.out.println(firstLar);
		System.out.println(secondLar);
		
		scanner.close();
	}

}
