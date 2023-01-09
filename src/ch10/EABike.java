package ch10;

public class EABike extends AbstractBike {

    @Override
    void run() {
        System.out.println("Running!");
    }

    public static void main(String args[]) {
        AbstractBike bike = new EABike();
        bike.run();
    }
}
