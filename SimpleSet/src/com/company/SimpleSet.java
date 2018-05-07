package com.company;

import java.util.HashSet;
import java.util.Set;

public class SimpleSet
{
    public static void main(String[] args)
    {
       SimpleSet simpleSet = new SimpleSet();

       simpleSet.run();
    }

    static void run()
    {
        Set<Integer> mySet = new HashSet<>();

        for(int i=1;i<6;i++)
        {
            mySet.add(i);
        }

        System.out.println(mySet);

        mySet.add(3);

        System.out.println(mySet);
    }
}
