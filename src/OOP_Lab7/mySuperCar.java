package OOP_Lab7;

import java.util.ArrayList;
import java.util.Scanner;
public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar> myCarList = new ArrayList<SuperCar>();
        myCarList = inputData(myCarList);
        System.out.println("== Show Super Car Info ==");
        for (int i=0;i<myCarList.size();i++){
            System.out.println(myCarList.get(i).getSuperCarInfo());
        }
    }
    private static ArrayList inputData(ArrayList myCarList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert super car info: ");
        for (int i =0;i<2;i++){
            System.out.println("Super car: "+(i+1));
            System.out.print("Brand: ");
            String b = scanner.nextLine();
            System.out.print("Color: ");
            String c = scanner.nextLine();
            System.out.print("Engine Size: ");
            String e = scanner.nextLine();
            System.out.print("speed: ");
            String p = scanner.nextLine();
            System.out.print("county: ");
            String t = scanner.nextLine();
            SuperCar Car  = new SuperCar(b,c,e,p,t);
            myCarList.add(Car);
        }
        return myCarList;
    }
}//class