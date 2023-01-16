package ch13.wrapper;

public class WrapperClassEx01 {
    public static void main(String args[]){
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        boolean isEquals1 = i1.equals(i2);
        boolean isEquals2 = i1 == i2;

        System.out.println(isEquals1);
        System.out.println(isEquals2);
    }
}
