package OOP_Lab5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {

        //ArrayList
        ArrayList List = new ArrayList();
        List.add("RAK");
        List.add("NOOK");
        List.add("TOU");
        System.out.println(List);
        List.add(2, 2017);
        System.out.println(List);
        List.remove(1);
        System.out.println(List);
        System.out.println(List.size());
        List.remove("TOU");
        System.out.println(List);
        System.out.println(List.get(1));
        System.out.println(List.indexOf(2017));

    }//main
}//class
