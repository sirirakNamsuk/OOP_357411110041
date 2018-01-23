package OOP_Lab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        //create objects as superCar
        SuperCar superCar1 = new SuperCar();

        superCar1.setbrand("Toyota");
        superCar1.setcolor("White");
        superCar1.setsize("3500cc");
        superCar1.setspeed("200/ชม.");
        superCar1.setCounty("Japan");

        System.out.println(superCar1.toString());

        SuperCar superCar2 = new SuperCar();
        superCar2 = inputData(superCar2);
        System.out.println(superCar2.toString());

    }//main

    public static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter SuperCar info: ");
        System.out.print("brand: ");
        s.setbrand(scanner.nextLine());
        System.out.print("color: ");
        s.setcolor(scanner.nextLine());
        System.out.print("size: ");
        s.setsize(scanner.nextLine());
        System.out.print("speed: ");
        s.setspeed(scanner.nextLine());
        System.out.print("county: ");
        s.setCounty(scanner.nextLine());

        return s;
    }

}//class