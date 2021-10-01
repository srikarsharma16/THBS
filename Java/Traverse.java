package srk.project.demo;


import java.util.Iterator;

import java.util.*;

public class Traverse {
    public static void main(String[] args) {

        List <Integer> values= new ArrayList<>();

        values.add(5);
        values.add(4);
        values.add(6);
        values.add(4);
        values.add(5);
        values.add(1);


        System.out.println("Array Values:"+values);
        Iterator it=values.iterator();


        //for(int i=0;i<5;i++)
        System.out.println("Traversing using For loop");
        for(int i=0;i<values.size();i++)
        {
        System.out.println(it.next());
        }

    }
}
