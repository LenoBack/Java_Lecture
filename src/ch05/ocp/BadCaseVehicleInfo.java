package ch05.ocp;

/**
 * OCP(개방-폐쇄원칙) 위배
 * 기존의 코드를 변경하지 않으면서(closed), 기능을 추가할 수 있도록(open) 설계
 * Vehicle 타입이 추가될 때마다 if문이 추가되어야 한다
 */
public class BadCaseVehicleInfo {
    // 슈퍼 메서드 => 모든 기능을 하나의 메서드에 개발=> 최악의 메서드
//    public double vehicleNumber(Vehicle vcl) {
//        if (vcl instanceof Car) {
//            return vcl.getNumber();
//            if (vcl instanceof Bike) {
//                return vcl.getNumber();
//            }
//        }
//    }
}
