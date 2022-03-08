package com.revature.main;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;

public class Driver {

    public static void main(String[] args) {
        Dog d1 = new Dog(4, "Fido");
        System.out.println(d1.getName());
        System.out.println(d1.getNumOfLegs());

        Animal a1 = new Dog(4, "Sparky");
        System.out.println(((Dog)a1).getName()); // Notice we are casting the Animal reference variable
        // into a Dog variable, so that we can call getName()
        // The animal class doesn't define the getName(), the Dog class does.
        // So, even though a1 is referring to a Dog object, we can't access the Dog's behaviours
        // without casting
        // Reference variable casting:
        //      1. Upcasting (Implicit and type-safe)
        //      2. Downcasting (Explicit  and not type-safe)

        Animal a2 = new Animal(4); //a2 is referring to an Animal object

        if(a2 instanceof Dog){// check if a2 is pointing to a Dog and only then do some downcasting
            System.out.println(((Dog)a2).getName()); // ClassCastException (can't turn Animal Object into Dog)
        } else {
            System.out.println("a2 is not pointing to a Dog, so we cannot print out a name");
        }

        Animal[] myAnimals = new Animal[4]; //null
        myAnimals[0] = new Dog(4, "Fido");
        myAnimals[1] = new Dog(4,"Sparky");
        myAnimals[2] = new Cat(4, "Whiskers");
        myAnimals[3] = new Cat(4,"Mr. Mittens");

        for (int i = 0; i < myAnimals.length; i++){
            Animal currentAnimal = myAnimals[i];

            if (currentAnimal instanceof Dog){
                ((Dog) currentAnimal).playFetch();
            } else if(currentAnimal instanceof Cat){
                ((Cat) currentAnimal).sniffCatnip();
            }
        }
    }
}
