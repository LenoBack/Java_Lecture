package ch07;

/**
 * Pass by value 예제
 */
public class PassByValueEx1 {
    public static void main(String args[]){
        int foo = 1;
        System.out.println(foo); // 1
        // Pass by value
        setFoo(foo);
        System.out.println(foo); // ?
    }

    public static void setFoo(int bar){
        bar = 2;
    }
}
