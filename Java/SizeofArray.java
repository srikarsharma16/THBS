package srk.project.demo;

import java.util.*;
public class SizeofArray {
    public static void main(String[] args) {

        List <Integer> values= new ArrayList<>();

        values.add(5);
        values.add(4);
        values.add(6);
        values.add(4);
        values.add(5);
        values.add(1);

        System.out.println("Array Values"+values);


        System.out.println("Size of the Array: "+values.size());

        values.remove(3);
        System.out.println("Array Values"+values);


        System.out.println("Size of the Array: "+values.size());

        Iterator it=values.iterator();


    }

}
