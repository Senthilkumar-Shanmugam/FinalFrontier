package com.practise.java8;

import java.util.function.Function;

public class FunctionalInterfaceDemo {
	
	public static void doWork(int value,Function<Integer,Integer> func){
		System.out.println(func.apply(value));
	}

	public static void main(String[] args) {
       Function<Integer,Integer> inc = e -> e+1;
       doWork(10, inc);
	}

}
