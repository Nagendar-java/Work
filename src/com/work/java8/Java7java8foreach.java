package com.work.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java7java8foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mylist= new ArrayList<Integer>();
		for(int i=0; i<=5; i++)
		{
			mylist.add(i);
		}

		Iterator<Integer> it= mylist.iterator();
		while(it.hasNext()) {
			Integer t=it.next();
			System.out.println(t);
		}
	

	MyConsumer action= new MyConsumer();
	mylist.forEach(action);
	
	}
}
class MyConsumer implements Consumer<Integer>
{
	public void accept(Integer t)
	{
		System.out.println("Consumner implementation value is "+ t);
	}
	}

