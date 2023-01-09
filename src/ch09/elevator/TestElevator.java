package ch09.elevator;

public class TestElevator {
    public static void main(String args[]){
        Elevator el = new Elevator();

        el.openDoor();
        el.closeDoor();
        el.goDown();
        el.goUp();
        el.openDoor();
        el.closeDoor();
        el.goDown();
        el.openDoor();
        el.goDown();
        el.closeDoor();
        el.goDown();
        el.goDown();
        el.playMusic();

        int curFloor = el.getFloor();
        if(curFloor != 5 && !el.isOpen()){
            el.setFloor(5);
        }

        el.openDoor();
        el.closeDoor();

        if(el.getFloor() !=3 && !el.isOpen()){
            el.setFloor(3);
        }
    }
}
