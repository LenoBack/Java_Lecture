package ch06;

public class ArrayCopyEx1 {
    public static void main(String args[]) {

        //                   0    1    2    3    4    5    6    7    8    9   10   11   12
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

        char[] copyTo = new char[7];
        // Array copy
        // copyFrom  : 복사할 대상 배열
        // srcPos : 복사할 배열 인덱스
        // dest : 복사한 값을 저장할 배열
        // destPos : 복사한 배열의 인덱스
        // legnth : 복사할 배열 길이
        // ==> caffein
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        // copy된 배열 출력
        System.out.println(String.valueOf(copyTo));

    }
}
