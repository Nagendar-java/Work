package com.work.java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str= new String[10];
		str[5]= "welconme to java";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent()) {
			
			String lowercase=str[5].toLowerCase();
			System.out.println(lowercase);
		}
		
		else {
			System.out.println("strin value is not present");	
			
			
			
		}
}
}