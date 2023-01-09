package ch06;

/**
 * 배열의 홀수 짝수 출력하는 예제
 */
public class OddEvenInArray {
    public static void main(String args[]){

        int a[]={1,2,5,6,3,2};
        System.out.println("홀수 :");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        System.out.println("짝수 :");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
