package ch04;

public class DoWhileEx {
    public static void main(String args[]) {
        int num = 0;
        // do 코드블록은 무조건 한 번은 실행된다
        do {
            System.out.print(num + " ");
            num++;
        } while( num < 3);

    }
}
