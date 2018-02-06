package OOP_Lab8;

import OOP_Lab9.Cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();
        dog.myPet();

        Cat cat =new Cat("Giant",2,"Persian");
        System.out.println(cat.toString());
        cat.makeNoise();
        cat.myPet();

        Cow cow = new Cow("Namjai",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();

    }//main
}//class
