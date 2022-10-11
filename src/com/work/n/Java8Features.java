package com.work.n;

import java.util.Arrays;
import java.util.List;

public class Java8Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> myList= Arrays.asList(12,23,45,56,78,87,65,43,43);
myList.stream().filter(n-> n%2==0).forEach(System.out::println);
		
	}

}
