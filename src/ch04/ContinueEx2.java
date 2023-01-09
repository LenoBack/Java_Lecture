package ch04;

/**
 * 반복문 라벨을 이용한 continue 예제
 */
public class ContinueEx2 {
    public static void main(String args[]) {
        outer : for(int i = 0; i<10; i++) {
            for(int j = 0; j<10; j++) {
                if(j>=5) {
                    continue outer;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
