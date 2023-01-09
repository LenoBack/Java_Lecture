package ch09;

/**
 * 은행 클래스
 */
class Bank{
    // 이자율 얻
    int getRateOfInterest(){return 0;}
}
//Creating child classes.
class KBBank extends Bank{
    int getRateOfInterest(){return 8;}
}

class WooriBank extends Bank{
    int getRateOfInterest(){return 7;}
}
class ShinhanBank extends Bank{
    int getRateOfInterest(){return 9;}
}

class TestBank{
    public static void main(String args[]){
        KBBank s=new KBBank();
        WooriBank i=new WooriBank();
        ShinhanBank a=new ShinhanBank();
        System.out.println("KB은행 이자율 : "+s.getRateOfInterest());
        System.out.println("우리은행 이자율 : "+i.getRateOfInterest());
        System.out.println("신한은행 이자율 : "+a.getRateOfInterest());
    }
}