package ch06;

/**
 * 배열 클래스 명
 */
public class ArrayEx07 {
    public static void main(String args[]) {

        int     iarr[] ={4,4,5};
        byte    barr[] ={4,4,5};
        short   sarr[] ={4,4,5};

        // Java 배열의 클래스 이름 얻기
        Class i=iarr.getClass();
        Class b=barr.getClass();
        Class s=sarr.getClass();

        String name1=i.getName();
        String name2=b.getName();
        String name3=s.getName();

        // 배열 객체의 경우 객체의 getClass().getName()를 통해 클래스명을 얻을 수 있는 프록시 클래스가 생성된다
        // 배열의 클래 이름의 타입과 동일하다
        System.out.println(name1); // [I
        System.out.println(name2); // [B
        System.out.println(name3); // [S
    }
}
