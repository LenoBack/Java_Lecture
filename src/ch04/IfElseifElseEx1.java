package ch04;

/**
 * if-else if-else 문
 */
public class IfElseifElseEx1 {
    public static void main(String args[]) {

        int age= 20;
        if (age < 10){
            System.out.println("아이");
        } else if (age >= 13 && age < 20){
            System.out.println("십대");
        } else if (age >= 20 && age < 50){
            System.out.println("성인");
        } else if (age >= 50 && age < 100){
            System.out.println("노년");
        } else {
            System.out.println("미분류");
        }
    }
}
