package ch04;

import java.util.ArrayList;

/**
 * for-each loop
 */
public class ForeachEx1 {
    public static void main(String args[]){

        // 배열
        String[] names = {"0-홍길동","1-김철수","2-이순신"};
        for(String name:names) {
            System.out.println(name);
        }
//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        // List type 콜렉션
        ArrayList<String> list=new ArrayList<String>();
        list.add("콜렉션-홍길동");
        list.add("콜렉션-김철수");
        list.add("콜렉션-이순신");
        for(String s:list){
            System.out.println(s);
        }

        // 배열 요소의 합을 계산
        int[] numbers = {3, 5, 9, 11, 15};
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println("배열 요소의 합 = " + sum);

    }


}
