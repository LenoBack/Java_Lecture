package ch04;

/**
 * continue 키워드
 */
public class ContinueEx1 {
    public static void main(String args[]) {
        for (int i =0; i<5; i++){
            if(i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
