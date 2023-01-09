package homework.ch04;

public class ch04 {

        public static void main(String args[]) {
            int grade= 0;
            int star = 0;

            System.out.println("Star pyramid");

            for(grade=0; grade<5; grade++){
                for(star=0; star<4-grade; star++){
                    System.out.print(" ");
                } //공백
                for(star=0; star<(2*grade)+1; star++){
                    System.out.print("*");
                } //별
                System.out.println();
            }
        }
}
