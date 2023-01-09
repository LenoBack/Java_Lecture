package ch02;

/**
 * 자료형간의 연산
 * CPU 연산의 최소 단위는 int(4 byte)이다
 */
public class TypeCastingEx3 {
    public static void main(String[] args) {

        // 같은 자료형 연산
        byte b1 = 3;
        byte b2 = 5;
        //byte b3 = b1 + b2; // 왜 오류일까요?
        int val1 = b1 + b2;

        int     val2 = 3+5; //8
        int     val3 = 8/5; //1
        double  val4 = 8.0/5.0; //1.6

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println("--------------");

        // 다른 자료형 연산
        //int val6 = 5 + 3.5;	//오류
        double val6 = 5 + 3.5;
        int val7 =  5 + (int)3.5;

        double val8 = 5/2.0;
        byte bb1 = 3;
        short bb2 = 5;
        int val9 = bb1 + bb2;
        double val10 = bb1 + bb2;

        System.out.println(val6);
        System.out.println(val7);
        System.out.println(val8);
        System.out.println(val9);
        System.out.println(val10);
    }
}
