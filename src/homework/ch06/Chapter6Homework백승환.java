package homework.ch06;

import java.util.Arrays;

public class Chapter6Homework {
    public static void main(String[] args) {
        // 원본 배열을 먼저 출력하고 회전 처리 후 출력 예
        /*
        원본 배열 : 왼쪽으로 2회전
            <-----
        1	2	3	4	5
        회전 후 배열 :
        3	4	5	1	2
         */
        // 배열 초기화
        int [] arr = new int [] {1, 2, 3, 4, 5};
        // 왼쪽으로 회전할 횟수
        int n = 2;
        // 2번 왼쪽으로 회전된 속성값이 저장될 배열 (장소)
        int [] answer = new int[arr.length];
        System.out.println("원본배열 : 왼쪽으로 2회전" +"\n" +  "<-----");
        //배열 출력 Array.tostring(배열 변수명)
        System.out.println(Arrays.toString(arr));
        //src - 원본 배열
        //srcPos - 원본 배열의 복사 시작 위치
        //dest - 복사할 배열
        //destPost - 복사할 배열의 복사 시작 위치
        //length - 복사할 요소의 개수
        System.arraycopy(arr,n, answer, 0, arr.length-n);
        System.arraycopy(arr,0, answer, arr.length-n, n);
        System.out.println("회전 후 배열:");
        System.out.println(Arrays.toString(answer));

    }
}
