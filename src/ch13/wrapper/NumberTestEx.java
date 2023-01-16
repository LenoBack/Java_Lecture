package ch13.wrapper;

public class NumberTestEx {
    public static void main(String args[]){
        Double doubleValue = Double.valueOf(123.456);

        int intValue = doubleValue.intValue(); // 소숫점 버림
        short shortValue = doubleValue.shortValue();
        long longValue = doubleValue.longValue();

        System.out.println("integer value: " + intValue);
        System.out.println("short value: " + shortValue);
        System.out.println("long value: " + longValue);
    }
}
