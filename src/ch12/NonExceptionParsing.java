package ch12;

public class NonExceptionParsing {
    public static void main(String args[]) {
        int sum = 0;
        String[] strArr = {"1", "2", "three", "4", "5"};
        for(int i=0; i<strArr.length; i++) {
            sum += Integer.parseInt(strArr[i]);
        }
        System.out.println("Sum = " + sum);
    }
}
