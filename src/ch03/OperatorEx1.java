package ch03;

/**
 * 산술 연산자
 */
public class OperatorEx1 {
    public static void main(String args[]) {
        int num1 = 31;
        int num2 = 6;

        System.out.println("+ 연산 : " +  (num1 + num2));
        System.out.println("- 연산 : " +  (num1 - num2));
        System.out.println("* 연산 : " +  (num1 * num2));
        System.out.println("/ 연산 : " +  (num1 / num2));
        System.out.println("% 연산 : " +  (num1 % num2));

        int sum1 = 100 + 50;    // 150 (100 + 50)
        int sum2 = sum1 + 250;  // 400 (150 + 250)
        int sum3 = sum2 + sum2; // 800 (400 + 400)

        System.out.println("sum1 : " +  sum1);
        System.out.println("sum2 : " +  sum2);
        System.out.println("sum3 : " +  sum3);

    }
}
