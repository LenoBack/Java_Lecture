package ch04;

/**
 * Break 키워드
 */
public class BreakEx1 {
    public static void main(String args[]) {
        for (int i =0; i<5; i++){
            if(i == 3) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
