package ch02;

/**
 * boolean 데이터 타입 예제
 */
public class BooleanTypeEx1 {
    public static void main(String[] args) {

        // 변수 초기화
        int a = 20;
        int b = 30;

        // boolean 변수 초기화
        boolean a1 = true;
        boolean b1 = false;

        /*
         *  b가 a보다 크면 a1(=true)를 출력
         */

        if (b > a) {
            System.out.println(a1);
        }else {
            System.out.println(b1);
        }

        boolean bb1 = false;
        boolean bb2 = true;
        // 값이 동일한지 비교
        boolean bb3 = (bb1==bb2);
        // 값이 다르기 때문에 false인데 !(NOT)으로 비고해서 true
        boolean bb4 = (bb1!=bb2);

        // false
        System.out.println(bb1);
        // true
        System.out.println(bb2);
        // 값이 달라서 false
        System.out.println(bb3);
        // 값이 다르지만 !(NOT)으로 비교해서 true
        System.out.println(bb4);

    }
}
