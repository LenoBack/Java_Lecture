package ch06;

public class ArrayEx05 {
    public static void main(String args[]) {

        // 2차원 배열의 length는 지정 안할 수 있다
        int[][] arrVar1 = new int[3][];

        // 0번째 배열 인덱스에 2차원 배열을 생성하고 값을 할당한다
        arrVar1[0] = new int[2];
        arrVar1[0][0] = 1;
        arrVar1[0][1] = 2;

        // 1번째 배열 인덱스에 2차원 배열을 생성하고 값을 할당한다
        arrVar1[1] = new int[5];
        arrVar1[1][0] = 3;
        arrVar1[1][1] = 4;
        arrVar1[1][2] = 5;
        arrVar1[1][3] = 6;
        arrVar1[1][4] = 7;

        int[][] arrVar2 = new int[2][];
        // 2차원 배열 생성 및 값 할당을 동시에 처리
        arrVar2[0] = new int[]{3, 4, 5};
        arrVar2[1] = new int[]{6, 7, 8};

        int[][] arrVar3 = new int[][]{
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8 }
        };

        System.out.println(arrVar1.length);
        // 2차원 배열의 length 값 출력
        System.out.println(arrVar1[0].length);
        System.out.println(arrVar2[1].length);
        System.out.println(arrVar3[2].length);

    }
}
