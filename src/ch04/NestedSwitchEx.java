package ch04;

/**
 * 중첩 switch 문
 */
public class NestedSwitchEx {
    public static void main(String args[]) {
        int num = 5;
        switch (num) {
            case 1:
            case 5:
                System.out.println("중첩 switch문");
                switch (num) {
                    case 1:
                        System.out.println("num 값은 1 입니다");
                        break;
                    case 5:
                        System.out.println("num 값은 5 입니다");
                        break;
                }
                break;
            case 7:
                System.out.println("num 값은 7 입니다");
                break;
            default:
                System.out.println("default 블럭 입니다");
        }
    }

}
