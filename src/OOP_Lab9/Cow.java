package OOP_Lab9;

import OOP_Lab8.Pet;

public class Cow extends Pet {


    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise(){
        System.out.print("more more !!!");
    }
}

