package com.work.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SeqparllelStreams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mylist= new ArrayList<Integer>();
		for(int i=0; i<=50; i++)
		{
			mylist.add(i);
		}
		
		Stream<Integer> seqStream= mylist.stream();
		
		//parllerl stream will not mainatin the order
		
		Stream<Integer> parStream= mylist.parallelStream();
		Stream<Integer> hihNumss= parStream.filter(p->p >30);
		hihNumss.forEach( p-> System.out.println("parllel stream is "+ p));
		
		
		//seqstream stream will  mainatin the order
		
			
				Stream<Integer> hiNumss= seqStream.filter(p->p >30);
				hiNumss.forEach( p-> System.out.println("sequential  stream is "+ p));
				
	}}


