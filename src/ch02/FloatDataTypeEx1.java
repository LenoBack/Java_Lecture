package ch02;

public class FloatDataTypeEx1 {
    public static void main(String[] args) {
        /*
         * n1,n2에 실수값을 할당
         * float 기본값 0.0f
         */
        float f1 = 10.89f;
        float f2 = 7.43f;
        float f3;
        f3 = f1 * f2;

        // 실수는 double 타입이 기본타입이기 때문에 f(F)를 붙여줘야 한다
        //float f4 = 5.89;

        float f5 = 10.5f; // 10.5
        float f6 = 10f; // 10.0
        // 실수 타입에 정수 값을 할당하면 float로 처리된다
        float f7 = 10; // 10.0

        System.out.println("f3 : " + f3);
        System.out.println("f5 : " + f5);
        System.out.println("f6 : " + f6);
        System.out.println("f7 : " + f7);

    }
}