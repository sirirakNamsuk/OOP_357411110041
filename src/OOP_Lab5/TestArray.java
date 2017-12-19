package OOP_Lab5;

public class TestArray {
    public static void main (String[] args) {
        int []number;
        number = new int[5];
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        number[3] = 100;
        number[1] = 50;
        number[2] = number[1] + number[3];
        number[2 + 2] = number[1] * 3; //150
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
    //for
    System.out.println("Data in array: ");
    for (int i=0;i<number.length;i++){
        System.out.print(number[i]+"number["+i+"]"+number[i]+" ");

    } //for
    for (int val: number){
        System.out.print(val+" ");
    }

    }//main


}//class

