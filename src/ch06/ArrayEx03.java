package ch06;

public class ArrayEx03 {
    public static void main(String args[]) {
        // 다차원 배열 => 가변 배열(Jagged Array)
        int[][] ages = {
            { 20, 15, 33, 72 },
            { 12, 50 },
            { 57, 20 },
            { 27, 32, 89 },
            { 73, 17 }
        };
        int sum = 0;

        // 이중 For 문
        for(int i=0;i < ages.length;i++) {
            for(int j=0;j < ages[i].length;j++) {
                System.out.printf("score["+i+"]["+j+"]="+ages[i][j]+"\n");
            }
        }

        // For-each Loop 문 (합계)
        for (int[] tmp : ages) {
            for (int i : tmp) {
                sum += i;
            }
        }

        System.out.println("합계 = "+sum);
    }
}
