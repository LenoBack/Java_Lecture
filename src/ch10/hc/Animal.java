package ch10.hc;

import ch10.abst.Cat;
import ch10.abst.Dog;
import ch10.abst.Duck;
import ch10.abst.Pet;

public class Animal {
    public static void main(String args[]) {
        // homogeneous collection (다형성)
        Pet myPets[] = new Pet[3];
        myPets[0] = new Cat();
        myPets[1] = new Duck();
        myPets[2] = new Dog();

        for(int i = 0, size = myPets.length; i < size; i++){
            myPets[i].speak();
        }
    }
}
