package ch04;

/**
 * while 문
 */
public class WhileEx {
    public static void main(String args[]) {
        int i=1;
        while(i<=10){
            if(i==5){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
