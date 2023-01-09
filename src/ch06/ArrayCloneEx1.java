package ch06;

/**
 * 배열 복제
 * java배열은 Cloneable interface를 구현했기에
 * clone() 메서드를 호출하여 복제본을 생성할 수 있다
 * 1차원 배열은 복제본(값을 복사)을 생성 (deep copy:실제 값을 복사)
 * 다차원 배열은 참조를 복사(shallow copy:얕은 복사)
 */
public class ArrayCloneEx1 {
    public static void main(String args[]){

        int arr[] = { 1,3,2,5 };
        System.out.println("원본 배열 : ");
        for(int i:arr)
            System.out.println(i);

        System.out.println("복제 배열 :");
        int cloneArr[] = arr.clone();
        for(int i:cloneArr)
            System.out.println(i);

    }
}
