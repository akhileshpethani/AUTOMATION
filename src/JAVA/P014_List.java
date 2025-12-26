package JAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//list/set/map -> collection framework

public class P014_List {
	public static void main(String[] args) {
		List list =new ArrayList<>();
		list.add("akhil");
		list.add(59);
		list.add(true);
		list.add(99.45);
		list.add(987654321);
		list.add("manan");
		System.out.println(list);
		System.out.println(list.size());
		list.remove(4);
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
