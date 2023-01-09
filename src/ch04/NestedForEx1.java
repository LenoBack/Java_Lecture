package ch04;

/**
 * 중첩 for 문
 */
public class NestedForEx1 {
    public static void main(String args[]) {
        int width = 10;
        int height = 5;

        for( int row=0; row < height; row++ ) {
            for( int col=0; col < width; col++ ) {
                System.out.print("*");
            } // inner for
            System.out.println();
        } // outer for
    }
}
