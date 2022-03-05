package com.revature.main;

import com.revature.model.Animal;
import com.revature.model.Dog;

public class Driver {

    public static void main(String[] args) {
        Dog d1 = new Dog(4, "Fido");
        System.out.println(d1.getName());
        System.out.println(d1.getNumOfLegs());

        Animal a1 = new Dog(4, "Sparky");
        System.out.println(((Dog)(a1)).getName());

        Animal a2 = new Animal(4); //a2 is referring to an Animal object

        if(a2 instanceof Dog){//check
            System.out.println(((Dog)(a2)).getName());
        } else {
            System.out.println("a2 is not pointing to a Dog, so we cannot print out a name");
        }
    }
}
