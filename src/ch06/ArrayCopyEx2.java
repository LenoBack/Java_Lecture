package ch06;

public class ArrayCopyEx2 {
    public static void main(String args[]) {

        //              0    1    2    3    4   5    6    7    8     9
        char[] abc = { 'A', 'B', 'C', 'D'};
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        //System.out.println(abc);
        //System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length); // ABCD
        System.arraycopy(num, 0, result, abc.length, num.length); //    123456789
        System.out.println(result); // ABCD0123456789

        // 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length); // 0123 -> ABCD abc가 카피되면서 변경됨
        System.out.println(num); // ABCD456789

        // num의 인덱스6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num); // ABCD45ABC9
    }
}
