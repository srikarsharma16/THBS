package srikar.assignment.programs;

import java.util.HashSet;
import java.util.Set;

public class ElementsExistsinHashTree {
    public static void main(String[] args) {

        Set<Integer> values = new HashSet<>();

        values.add(5);
        values.add(4);
        values.add(6);
        values.add(4);
        values.add(5);
        values.add(1);

        System.out.println("Hash set elements: "+values);

        //checking for value 5 in set

        System.out.println("Does the set contains '5'? : "+values.contains(5));

        //checking for random values
        System.out.println("Does the set contains '8'? : "+values.contains(8));

    }
}
