package com.practise.sorting;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       /* ArrayList<ArrayList<Integer>> array =
            new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<10000; i++) {
            try {
                array.add(new ArrayList<Integer>(1000000));
            } catch (OutOfMemoryError e) {
                System.out.println(i);
                break;
            }
        }*/
    	
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	a.add(10);
    	a.add(-2);
    	 int i=0;
    	    while(i<a.size())
    	        if (a.get(i) < 0) 
    	            a.remove(i);
    	        else
    	            i++;
    	}

    	for(int item:a)
    		System.out.print(item);
    }

