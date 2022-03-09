package com.revature.main;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe", 18);
        Person p2 = new Person("Jane", "Doe", 24);
        Person p3 = new Person("Bach", "Tran", 24);

        // ArrayList<Person> people  = new ArrayList<>();
        // people.add(p1);
        // people.add(p2);
        // people.add(p3);

        // System.out.println(people);

        MyCustomArrayList people = new MyCustomArrayList();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        for(int i=0; i<people.size(); i++){
            System.out.println(people.get(i));
        }
    }
}
