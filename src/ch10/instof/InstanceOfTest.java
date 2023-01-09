package ch10.instof;


class Printable{}
class A extends Printable{
    public void a(){System.out.println("a method");}
}
class B extends Printable{
    public void b(){System.out.println("b method");}
}

class Call{
    // Polymorphic arguments로 전달된 상위타입의 실제 객체로
    // 다운캐스팅하여 메서드를 실행해야 하는 경우가 있다
    void invoke(Printable p){ //upcasting
        if(p instanceof A){
            A a=(A)p; //Downcasting
            a.a();
        }
        if(p instanceof B){
            B b=(B)p; //Downcasting
            b.b();
        }
    }
}//end of Call class

public class InstanceOfTest{
    public static void main(String args[]){
        Printable p1=new B();
        Printable p2=new A();
        Call c=new Call();
        c.invoke(p1);
        c.invoke(p2);
    }
}