package ch09.covariant;

class Producer {
    public Object produce(String input) {
        Object result = input.toLowerCase();
        return result;
    }
}

public class StringProducer extends Producer {
//    @Override
//    public Object produce(String input) {
//        Object result = input.toLowerCase();
//        return result;
//    }

    //    // 오버라이드 메서드의 리턴타입 하위클래스 타입 중 구체적인 타입으로 변환하면서
//    // Covariant return type이 된다
    @Override
    public String produce(String input) {
        return input.toLowerCase();
    }

    public static void main(String args[]){
        String integerAsString = "42";
        Producer producer = new StringProducer();
        System.out.println("result : " + producer.produce("문자열"));
    }

}


