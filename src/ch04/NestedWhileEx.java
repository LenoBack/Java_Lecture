package ch04;

/**
 * 중첩 while 문
 */
public class NestedWhileEx {
    public static void main(String args[]) {
        int colLength = 3;
        int rowLength = 10;
        int colCount = 0;
        int rowCount;
        while(colCount < colLength) {
            rowCount = 0;
            while(rowCount < rowLength) {
                System.out.print("*");
                rowCount++;
            }
            System.out.println();
            colCount++;
        }
    }
}
