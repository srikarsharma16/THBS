package srikar.assignment.programs;

import java.util.ArrayList;

public class ListtoArray {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("List vales:"+list);
        //converting ArrayList to Object[] array

        Object[] values= list.toArray();

        System.out.println("Array Values:");

        for(Object obj: values)
        {
            System.out.println(obj);
        }
    }
}
