package ch04;

/**
 * 레이블지정 break 키워드
 */
public class BreakEx2 {
    public static void main(String args[]) {
        // 레이블 first
        first:
        for( int i = 1; i < 5; i++) {
            // 레이블 second
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);
                if ( i == 2) {
                    // 현재 loop를 종료하고 first 레이블의 loop가 종료된다
                    break first;
                }
            }
        }
    }
}
