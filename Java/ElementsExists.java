package srikar.assignment.programs;

import java.util.*;
import java.util.ArrayList;

public class ElementsExists {
    public static void main(String[] args) {

        List <Integer> values= new ArrayList<>();

        values.add(5);
        values.add(4);
        values.add(6);
        values.add(4);
        values.add(5);
        values.add(1);

        System.out.println("Array Values"+values);


        System.out.println("Value 5 contains in the array: "+values.contains(5));

        System.out.println("Value 10 contains in the array: "+values.contains(10));



    }
}
