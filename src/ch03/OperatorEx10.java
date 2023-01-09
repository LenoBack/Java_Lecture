package ch03;

/**
 * 논리 연산자
 */
public class OperatorEx10 {
    public static void main(String args[]){
        int a=10;
        int b=5;
        int c=20;
        // 첫번째 조건이 false 이므로 두번째 조건 확인 안함
        System.out.println( a<b && a++<c );//false && true = false
        System.out.println( a );// 두번째 조건이 확인되지 않았기 때문에 10
        // 첫번째 조건, 두번째 조건 모두 확인함
        System.out.println( a<b & a++<c );//false && true = false
        System.out.println( a );// 두번째 조건이 확인되었기 때문에 11

        a = 10;

        // 첫번째 조건이 true이므로 두번째 조건 확인 안함
        System.out.println(a>b || a<c); // true || true = true
        // 첫번째 조건, 두번째 조건 모두 확인함
        System.out.println(a>b | a<c); // true | true = true

        System.out.println(a>b || a++<c);//true || true = true
        System.out.println(a); // 두번째 조건이 확인되지 않았기 때문에 10
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a); // 두번째 조건이 확인되었기 때문에 11

    }
}
