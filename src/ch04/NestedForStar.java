package ch04;

/**
 * 중첩 for 문 - 삼각형 별 출력
 */
public class NestedForStar {
    public static void main(String args[]) {

        /*
         별이 늘어나는 삼각형
         *
         **
         ***
         ****
         *****
         */
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
         별이 줄어드는 삼각형
         *****
         ****
         ***
         **
         *
         */
        for(int i=1; i<=5; i++) {
            for(int j=5; j >= i; j--) {
                System.out.print("*");
            } // 별 출력 for
            System.out.println();
        } // 다음 라인 for
        System.out.println();

    }
}
