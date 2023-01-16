package ch13;
import static java.lang.System.*;

public class MathTest {
    public static void main(String args[]){
        out.println("10의 절대값 : " + Math.abs(10));
        out.println("10.0 절대값 : " + Math.abs(10L));
        out.println("20.0d의 절대값 : " + Math.abs(-20.0d));
        out.println("큰 값을 반환 : " + Math.max(20, 10));
        out.println("작은 값을 반환 : " + Math.min(10.0, 20.0));
        out.println("Random 값을 반환 : " + Math.random());
        out.println("올림 값 : " + Math.ceil(20.3));
        out.println("작거나 같은 가장 작은 정수를 반환 : " + Math.floor(99.7));
        out.println("가장 가까운 정수를 double 타입으로 반환 : " + Math.rint(101.57));
        out.println("radians로 지정된 sin 값을 반환 : " + Math.sin(100));
        out.println("radians로 지정된 cos 값을 반환 : " + Math.cos(100));
        out.println("radians로 지정된 tan 값을 반환 : " + Math.tan(100));
        out.println("100으로 지정된 로그값을 반환 : " + Math.log(100));
        out.println("3.0의 2.0승 값을 double 값으로 반환 : " + Math.pow(3.0, 2.0));
        out.println("Square root값을 double 값으로 반환 : " + Math.sqrt(3));
   }
}
