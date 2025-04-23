/*
[ 문제 ] 
10개의 정수를 입력 받는다. 
각 정수가 몇 번 등장했는지를 입력받은 순서대로 출력하시오. 
입력 받은 숫자와 총 입력 횟수를 함께 출력하시오. 
동일한 숫자에 대해서는 한번만 출력하시오.

입력예시1
13 2 2 5 6 3 3 3 3 5

출력예시1
13 1   ↦ 13을 가장 먼저 입력했음  
2 2
5 2    ↦ 5를 2번 입력했다는 의미
6 1
3 4    ↦ 3을 4번 입력했다는 의미

입력예시2
1 1 1 3 3 3 4 20 10 3

출력예시2
1 3
3 4
4 1 
20 1
10 1 
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();        // 입력 순서를 유지하는 Map

        // 10개의 숫자 입력 받기
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);        // 숫자 개수 세기
        }

        // 결과 출력 (입력된 순서대로)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        /*
            Map.Entry<Integer, Integer> entry
        → 위의 (key, value) 쌍 하나를 꺼내서 담는 변수입니다.

        entry.getKey()
        → 현재 쌍의 key를 가져옵니다 (여기선 입력한 숫자).

        entry.getValue()
        → 현재 쌍의 value를 가져옵니다 (해당 숫자의 개수).

        System.out.println(...)
        → 숫자와 그 개수를 한 줄에 출력합니다.
        */
        sc.close();
    }
}
