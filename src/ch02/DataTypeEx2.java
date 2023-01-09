package ch02;

public class DataTypeEx2 {
    public static void main(String args[]) {
        int i;
        double d;

        // 피연산자가 int 정수이기 때문에 정수로 계산되어 1
        // 하지만 값은 double(실수형) 타입에 할당되어 실수형으로 변환된다
        d = 5 / 4;
        System.out.println(d); // 1.0

        // 형변환 우선순위가 높기 때문에 먼저 실행 정수 5 -> 부동소수섲ㅁ 5.0으로 변환
        // 5.0/4 -> 5.0이 double형이기에 4도 double형으로 자동형변환되고 5.0/4.0으로 1.25의 결과 나옴
        d = (double) 5 / 4;
        System.out.println(d); // 1.25

        // 실수가 모두 정수값으로 변환되도 5 + 5 = 10
        d = (int) 5.2 + (int)5.4;
        System.out.println(d); // 10
    }
}