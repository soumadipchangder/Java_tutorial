package collection_framework;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		//generic-> same type element <Datatype>
		//non-generic-> different type element
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("O");
		a2.add("O");
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(2,a2);
		System.out.println(a1);
	}

}
