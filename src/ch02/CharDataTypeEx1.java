package ch02;

/**
 * 문자(char) 데이터타입 예제
 * 값 할당 : 문자 -> 유니코드 -> 정수로 메모리 저장
 * 출력 : 정수 -> 유니코드 -> 문자로 변환해서 출력
 */
public class CharDataTypeEx1 {
    public static void main(String[] args) {
        // 문자 저장
        char c1 = 'A';
        char c2= '가';
        // 정수 저장
        char c3 = 65;
        char c4 = 0xac00;
        // 유니코드로 저장
        // 유니코드표 : https://ko.wikipedia.org/wiki/%EC%9C%A0%EB%8B%88%EC%BD%94%EB%93%9C_0000~0FFF
        // 한글유니코드표 : https://jjeong.tistory.com/696
        char c5 = '\u0041';
        char c6 = '\uac00';
        System.out.println(c1); //A
        System.out.println(c2); //가
        System.out.println("--------");
        System.out.println(c3); //A
        System.out.println(c4); //가
        System.out.println("--------");
        System.out.println(c5); //A
        System.out.println(c6); //가
        System.out.println('\ub0d0'); //나

    }
}
