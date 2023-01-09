package ch07;

public class MethodAddition {
    public static void main(String[] args){
        int a = 19;
        int b = 5;
        // method calling parameter 전달
        int c = add(a, b);
        System.out.println("a + b 합 = " + c);
    }

    /**
     * static method 정의
     * @param n1
     * @param n2
     * @return
     */
    public static int add(int n1, int n2){
        int s;
        s=n1+n2;
        return s;
    }
}
