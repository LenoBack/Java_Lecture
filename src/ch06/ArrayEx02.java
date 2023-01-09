package ch06;

import java.util.Arrays;

public class ArrayEx02 {
    public static void main(String args[]) {
        int[] arr1 = new int[10];
        int[] arr2 = {100, 95, 80, 70, 60};
        char[] chrArr = { 'a', 'b', 'c' };

        // 배열에 값 할당
        for (int i=0; i < arr1.length ; i++ ) {
            arr1[i] = i + 1;
        }

        // 배열의 값 출력
        for(int i=0; i < arr2.length;i++) {
            System.out.print(arr2[i] + "\t");
        }

        System.out.println();

        System.out.println("for-each loop 배열 출력");
        for(int i:arr1){
            System.out.print(i + "\t");
        }

        System.out.println();

        // Arrays.toString는 배열의 내용을 출력하는데 사용한다
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(chrArr));

        // 배열 변수는 객체참조변수라서 배열 변수는 배열의 주소값만 보관된다
        System.out.println(arr1);
    }
}
