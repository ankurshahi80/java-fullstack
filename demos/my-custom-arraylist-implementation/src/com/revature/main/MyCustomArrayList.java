package com.revature.main;

public class MyCustomArrayList {

    private int numOfElements; // default value for primitive fields is 0, false, or null.
    private Person[] value;

    public MyCustomArrayList() {
        this.value = new Person[2];
    }

    public MyCustomArrayList(int capacity){
        this.value = new Person[capacity];
    }

    public void add(Person element){
        // Check if numOfElements is the same as the size of the array
        if (this.numOfElements == value.length){ // if true, create a new array that is larger
            Person[] oldArray = this.value;
            this.value = new Person[this.numOfElements * 2]; // Create an array that is double the size of the original

            // copy over all the elements from the original array
            for (int i = 0; i <oldArray.length; i++){
                this.value[i] = oldArray[i];
            }
        }

        this.value[this.numOfElements] = element;
        this.numOfElements++;
    }

    public Person get(int index){
        return this.value[index];
    }

    public int size() {
        return this.numOfElements;
    }
}
