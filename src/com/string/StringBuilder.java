package com.string;

import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class StringBuilder {

	public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder stringBuilder = new StringBuilder("GAURAV");
		String name= "GAURAV";
		
		System.out.println(name);
		String substring = name.substring(0, 3);
		System.out.println(substring);
		
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(70);
		list.add(20);
		list.add(80);
		list.add(20);
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(20);
		
		System.out.println(list);
		int count10=0;
		int count20=0;
		
		for(int i =0 ; i<=list.size(); i++) {
			if(i==10) {
				count10++;
			}

			
		}
		
		
		
		
		
	}

}
