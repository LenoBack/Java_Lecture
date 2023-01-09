package ch04;

/**
 * for 문
 */
public class ForEx1 {
    public static void main(String args[]) {
        int sum = 0;
        for( int i = 1; i <= 10; i++ ) {
            sum = sum + i;
        }
        System.out.println("for문 결과 : " + sum);

        for( int i=0, j=10 ; i <= j ; i=i+2, j=j-3 ) {
            System.out.printf("i=%d, j=%d\n", i, j);
        }
    }
}
