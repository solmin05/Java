/*
[ 문제 ] 
배열에 5개의 정수를 입력 받아서 저장하시오.
  - 첫 번째 원소와 두 번째 원소를 비교하여 
    첫 번째 원소가 두 번째 원소보다 크면 서로 교환하여 저장하시오.
  - 이 교환 연산을 첫 번째 원소부터 마지막 바로 전 원소까지 반복하시오.
  - 참고 : 제일 큰 수가 맨 뒤로 이동한다.

입력예시1
5 4 3 2 1

출력예시1
4
3
2
1
5
*/
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];//배열 선언 
		
		for(int i = 0; i < 5; i++){
		    arr[i] = sc.nextInt(); // 배열에 입력한 값 저장 
		}
		
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            
        }
	    
	for(int i=0;i<5;i++){
		    System.out.print(arr[i]+" ");
		}
		
		
	}
}
