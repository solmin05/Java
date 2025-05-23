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
import java.util.*;  // Scanner, Arrays 사용을 위해 import

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int[] num = new int[5];               // 정수 5개 저장할 배열

        for(int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();            
        }

        Arrays.sort(num);                     // 오름차순 정렬

        System.out.println(num[4]);           // 가장 큰 수 출력
        System.out.println(num[3]);           // 두 번째로 큰 수 출력

        sc.close();                           
    }
}

