package OOP_Lab5;
//1. input Data from user
//2. find summation of data in array
//3. find average value of data in array
//4. find maximum value of data in array
//5. find minimum value of data in array
//6. Sorting data with Descending Order
//7. Sorting data with Ascending Order
import java.util.Scanner;

public class InputDataToArray {
    private static final int MAX = 10;

    public static void main(String[] args) {
        Integer num[] = new Integer[MAX];
      num = inputData(num);
      showData(num);
      summation (num);
      findMax(num);

    }//main

    private static void findMin(Integer[] num) {
        System.out.println("The minimum value is: "+
                (Collections.min(Array.asList(num))));
    }//findMin

    private static void findMax(Integer[] num) {
        System.out.println("The maximum value is: "+
                (Collections.min(Array.asList(num))));
    // max value with basic code
    Integer max = num[0];
    for (int i=0;i<num.length;i++){
        if (max<=num[i]){
            max = num[i];
        }
    }
    System.out.println("The maximum value is: "+max);

    }//findMax

    private static void summation(Integer[] num) {
        int total = 0;
        for (int i=0;i<num.length;i++){
            total += num[i];
        }
        System.out.println("\n10The summation of" + "value in array is: "+total);
        System.out.println("The average value" + "in array is: "+total/MAX);
    }

    private static void showData(Integer[] num) {
        System.out.println("Data in array: ");
        for (int val: num)
            System.out.print(val+" ");
    }

    private static int[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter data to array: ");
        for (int i=0;i<num.length;i++){
            System.out.print("number["+i+"]: ");
            num[i] = scanner.nextInt();
        }
        return num;
    }
}//class
