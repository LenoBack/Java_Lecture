package ch09.elevator;

public class Elevator {

    private boolean doorOpen= false;
    private int floor = 1;
    private int weight = 0;

    final int CAPACITY = 1000;
    final int TOP_FLOOR = 5;
    final int BOTTOM_FLOOR = 1;
    final String MUSIC = "Lyle Lovett";

    public boolean isOpen() {
        return doorOpen;
    }

    public int getFloor() {
        return floor;
    }

    public int getWeight() {
        return weight;
    }

    public void openDoor(){
        doorOpen = true;
    }

    public void setFloor(int goal) {
        while(floor != goal){
            if(floor < goal){
                goUp();
            }else{
                goDown();
            }
        }
    }

    public void closeDoor(){
        checkWeightSensors();

        if(weight <= CAPACITY){
            doorOpen = false;
        }else{
            // The computer beeps 10 times
            for(int counter = 0; counter < 10; counter++){
                System.out.print((char)7);
            }
            System.out.println();
        }
    }

    private void checkWeightSensors(){
        weight = (int)(Math.random() * 1500);
        System.out.println("The weight is " + weight);
    }

    public void goUp(){
        if(!doorOpen){
            if(floor < TOP_FLOOR){
                floor++;
                System.out.println(floor);
            }else{
                System.out.println("Already on top floor.");
            }
        }else{
            System.out.println("Doors still open!");
        }
    }

    public void goDown(){
        if(!doorOpen){
            if(floor > BOTTOM_FLOOR){
                floor--;
                System.out.println(floor);
            }else{
                System.out.println("Already on bottom floor.");
            }
        }else{
            System.out.println("Doors still open!");
        }
    }

    public String playMusic(){
        System.out.println(floor);
        System.out.println("Mmm, the soothing strains of " + MUSIC);
        return MUSIC;
    }


}
