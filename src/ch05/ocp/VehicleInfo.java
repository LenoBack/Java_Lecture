package ch05.ocp;

/**
 * 하위클래스를 추가하고 vehicleNumber()를 하위클래스 특성에 맞게 재정의
 */
public class VehicleInfo {
    public int getVehicleNumber(){
        return 0;
    }
}
 class Car extends VehicleInfo {
    private int vehicleNumber;
     public int getVehicleNumber() {
         return this.vehicleNumber;
     }
 }

class Bike extends VehicleInfo {
    private int vehicleNumber;
    public int getVehicleNumber() {
        return this.vehicleNumber;
    }
}
