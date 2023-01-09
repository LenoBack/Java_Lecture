package ch09;

import ch09.petinheritance.Cat;
import ch09.petinheritance.Dog;
import ch09.petinheritance.Duck;
import ch09.petinheritance.Pet;

public class Animal {
    public static void main(String args[]) {
        Pet pet = new Pet();
        pet.speak();

        // 오버라이딩된 메서드를 호출한다
        Pet dog = new Dog();
        dog.speak();

        // homogeneous collection (다형성)
        Pet myPets[] = new Pet[4];
        myPets[0] = new Pet();
        myPets[1] = new Cat();
        myPets[2] = new Duck();
        myPets[3] = new Dog();

        for(int i = 0, size = myPets.length; i < size; i++){
            myPets[i].speak();
        }
    }
}
