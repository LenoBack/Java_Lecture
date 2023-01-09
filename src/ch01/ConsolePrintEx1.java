package ch01;

/**
 * System.out.print(), println() 메서드 예제
 */
public class ConsolePrintEx1 {
    public static void main(String args[]) {

        System.out.println("안녕하세요. 반갑습니다!"); // public void println(String x)
        System.out.println("1" + 2 + 3); // public void println(String x)
        System.out.println((2 + 3)); // public void println(int x)
        System.out.println(4.6); // public void println(double x)
        System.out.println(1); // public void println(int x)
        System.out.println("문자"); // public void println(String x)
        System.out.println(); // public void println(){newLine();}
        int a = 123;
        String b = "하세요";
        System.out.println(a);
        System.out.println(b);
        System.out.println("안녕"+b);
        System.out.println(a + "안녕" + b);
    }
}
