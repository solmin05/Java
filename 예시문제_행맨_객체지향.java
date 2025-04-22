/*
[ 문제 ] 
(Hangman) 정답이 되는 3글자의 영단어를 입력한 후 엔터키를 누른다.
  - 정답을 맞추기 위하여 한 글자씩 입력한 후 엔터키를 누른다.
  - 5번까지 시도할 수 있다.
  - 글자를 입력할 때 마다 현재 상태를 화면에 출력한다.

  - 정답을 맞추거나, 5번이 경과하면 프로그램은 종료된다.
      Hint: 문자 입력 후에는 getchar( ) 함수를 추가하여 엔터 문자를 버퍼에서 제거해야, 
               다음에 문자 입력이 정상적으로 실행된다.

  - 출력할 때 빈칸이 각 문자의 앞에 오도록 하시오.  예) □1□2□3

    (□ 기호는 공백 1칸을 의미)

입력예시1
cat
a
b
c
t

출력예시1
□_□a□_
□_□a□_
□c□a□_
□c□a□t

입력예시2
dog
a
b
c
d
e

출력예시2
□_□_□_
□_□_□_
□_□_□_
□d□_□_
□d□_□_
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정답 단어 입력 (3글자)
        String answer = scanner.nextLine().toLowerCase();

        // 상태 저장용 배열
        char[] result = { '_', '_', '_' };

        int attempts = 0;

        while (attempts < 5) {
            String inputLine = scanner.nextLine().toLowerCase();
            char inputChar = inputLine.charAt(0);

            // 정답 확인 및 상태 갱신
            for (int i = 0; i < 3; i++) {
                if (answer.charAt(i) == inputChar) {
                    result[i] = inputChar;
                }
            }

            // 현재 상태 출력 (문제에서 제시한 형식: □_□a□_)
            for (int i = 0; i < 3; i++) {
                System.out.print(" " + result[i]); // 앞에 한 칸 공백
            }
            System.out.println();

            // 정답 맞췄는지 체크
            if (new String(result).equals(answer)) {
                break;
            }

            attempts++;
        }

        scanner.close();
    }
}
