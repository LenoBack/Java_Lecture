package ch10.polymultielvelinhr;

// Dog의 eat() 메서드를 오버라이드하지 않았다
public class BabyDogEx2 extends Dog {
    public static void main(String args[]){
        Animal a=new BabyDogEx2();
        a.eat();
    }
}
