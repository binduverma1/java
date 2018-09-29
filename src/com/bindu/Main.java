package com.bindu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Animals {
    int order;
    String code, desc;

    // Constructor
    public Animals( int order, String code,
                    String desc)
    {
        this.order = order;
        this.code = code;
        this.desc = desc;
    }


    public String toString ()
    {
        return this.order + " " + this.code +
                " " + this.desc;
    }
}

//
class SortbyOrder implements Comparator<Animals>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Animals a, Animals b)
    {
        return a.order - b.order;
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Animals> ar = new ArrayList<Animals>();
        ar.add(new Animals(04, "A1", "Cat"));
        ar.add(new Animals(02, "A2", "Horse"));
        ar.add(new Animals(01, "A3", "Elephant"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortbyOrder());

        System.out.println("\nSorted by order");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


        Collections.sort(ar, new SortbyOrder());

        System.out.println("\nSorted by order");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
// for description sort
//       Collections.sort(ar, new SortbyDesc());
//        System.out.println("\nSorted by desc");
//        for (int i=0; i<ar.size(); i++)
//            System.out.println(ar.get(i));
    }
}
