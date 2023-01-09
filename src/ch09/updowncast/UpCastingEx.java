package ch09.updowncast;

class CastingParent{
    String name;
    void printData() {
        System.out.println("상위클래스 메서드");
    }
}
class CastingChild extends CastingParent {
    int age;
    void printData() {
        System.out.println("하위클래스 메서드");
    }
}
public class UpCastingEx {
    public static void main(String args[]) {
        CastingChild child1 = new CastingChild();
        CastingParent parent1 = child1; // 업캐스팅
        System.out.println(parent1.name);
        //System.out.println(parent1.age); // 업캐스팅되면 접근 불가

        // 다운캐스팅되면 상위,하위클래스 모두 접근 가능
        CastingParent parent2 = new CastingChild();
        CastingChild child2 = (CastingChild)parent2; // 다운캐스팅
        System.out.println(child2.name);
        System.out.println(child2.age);
    }
}
