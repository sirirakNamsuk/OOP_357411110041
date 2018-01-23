package OOP_Lab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        //create objects as superCar
        SuperCar superCar1 = new SuperCar();

        superCar1.setCar_brand("Toyota");
        superCar1.setCar_color("White");
        superCar1.setEnging_size("3500");
        superCar1.setMax_speed("200");
        superCar1.setCounty("Japan");

        System.out.println(superCar1.toString());

        SuperCar superCar2 = new SuperCar("Isuzu",
                "Red","2500","220","Thai");

        System.out.println(superCar2.toString());
        superCar2.setCar_brand("BMW");
        System.out.println(superCar2.toString());

        SuperCar superCar3 = new SuperCar();
        // superCar3 = inputData(superCar3);

        //System.out.print(superCar3.toString());

        System.out.println(superCar1.gender);
        System.out.println(superCar1.gender);

    }//main

    public static SuperCar inputData(SuperCar car) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your SuperCar data: ");
        System.out.print("car_brand: ");
        car.setCar_brand(scanner.nextLine());
        System.out.print("car_color: ");
        car.setCar_color(scanner.nextLine());
        System.out.print("enging_size: ");
        car.setEnging_size(scanner.nextLine());
        System.out.print("max_speed: ");
        car.setMax_speed(scanner.nextLine());
        System.out.print("county: ");
        car.setCounty(scanner.nextLine());

        return car;
    }

}//class
