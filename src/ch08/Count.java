package ch08;

public class Count {
    private int serialNumber;
    private static int counter = 0;

    public Count(){
        counter++;
        serialNumber = counter;
    }

    public static int getTotalCount() {
        return counter;
    }

//    public static int getSerialNumber(){
//        // static 멤버가 인스턴스 멤버를 참조해야 할 경우 인스턴스를 생성하여 접근
////        Count c = new Count();
////        int i = c.serialNumber;
////        return serialNumber; // Compile error
//    }
}
