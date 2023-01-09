package ch05.test.pkg;
import ch05.ProtectedAccModClass;

public class ProtectedClassB extends ProtectedAccModClass {
    void getData(){
        System.out.println("Parent var : " + var);
    }
}
