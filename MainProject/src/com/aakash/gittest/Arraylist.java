package com.aakash.gittest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Aakash","Avdhut","Rajesh","Gourav","Vishal");
		
		Iterator<String> itr = nameList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
