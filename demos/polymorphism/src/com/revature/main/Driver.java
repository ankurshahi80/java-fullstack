package com.revature.main;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;

import java.util.Scanner;

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

            currentAnimal.makeNoise(); // If the animal is a Dog, it will woof!
            // If the animal is a Cat, it will meow
            // The reference variable, which is of the type Animal, doesn't matter for this
        }

        Animal a = new Cat(4, "Tiger");
        a.eat();
        a.eat("fish");
        a.eat("steak", "fish", "catnip"); // var-args

        Scanner sc = new Scanner(System.in);
        // "scan" System.in (console input)
        // So, the Scanner object allows for a user to send information to a program
        System.out.println("Select a Dog, Cat, or Animal" );
        System.out.println("1.) Dog");
        System.out.println("2.) Cat");
        System.out.println("3.) Animal");
        int choice = Integer.parseInt(sc.nextLine()); // Use the static method parseInt belonging
        //  to the Integer class to covert from a String to int

        Animal myAnimalChoice = null;
        switch (choice){
            case 1:
                System.out.println("Enter the Dog's name: ");
                String dogName = sc.nextLine();
                System.out.println("Enter number of legs: ");
                int dogLegs = Integer.parseInt(sc.nextLine());
                myAnimalChoice = new Dog(dogLegs, dogName);
                break;
            case 2:
                System.out.println("Enter the Cat's name: ");
                String catName = sc.nextLine();
                System.out.println("Enter number of legs: ");
                int catLegs = Integer.parseInt(sc.nextLine());
                myAnimalChoice = new Cat(catLegs, catName);
                break;
            default:
                System.out.println("Enter number of legs: ");
                int numberOfLegs = Integer.parseInt(sc.nextLine());
                myAnimalChoice = new Animal(numberOfLegs);
        }

        myAnimalChoice.makeNoise();
    }
}
