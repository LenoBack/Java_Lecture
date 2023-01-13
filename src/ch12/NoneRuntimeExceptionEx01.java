package ch12;

public class NoneRuntimeExceptionEx01 {
    public static void main(String args[]){
        int i = 0;
        String strArr[] = {
            "Hello World", "Array", "Example"
        };
        while (i < 4) {
            System.out.println(strArr[i]);
            i++;
        }
    }
}
