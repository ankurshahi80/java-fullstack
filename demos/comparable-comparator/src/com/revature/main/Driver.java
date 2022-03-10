package com.revature.main;

import com.revature.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Bach", "Tran", 24));
        people.add(new Person("John","Doe", 18));
        people.add(new Person("Jane","Doe", 25));
        people.add(new Person("John", "Doe",30));
        people.add(new Person("Mark","Smith", 18));

        Collections.sort(people);

        System.out.println(people);
    }
}
