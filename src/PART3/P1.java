package PART3;

import java.util.Scanner;

public class P1 {
    private static final int x = 2561;
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 3; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Year : ");
            int y = scanner.nextInt();
            System.out.println("Age : " + (x - y));
            i++;
        }
    }//main
}//class
