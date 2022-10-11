package com.work.java8;

import java.time.LocalDate;
import java.time.ZoneId;

public class DateTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate today = LocalDate.now();

System.out.println("Today's date"  +   today); 

//Zoneid

LocalDate todayKol= LocalDate.now(ZoneId.of("Asia/Kolkata"));
System.out.println("Zone of country is "+ todayKol);

LocalDate dateFormat = LocalDate.ofEpochDay(365);
System.out.println("365 days from the ase date"+ dateFormat);

LocalDate dateOfTheYear = LocalDate.ofYearDay(2022, 100);
System.out.println("100 th day iun 2022 year"+dateOfTheYear);



	}

}
