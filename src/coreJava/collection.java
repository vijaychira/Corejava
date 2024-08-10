package coreJava;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;



public class collection {

	public static void main(String[] args) {
		Queue<String>q=new PriorityQueue<>(Comparator.reverseOrder());
		q.offer("Falcon");
		q.add("Wolf");
		q.offer("Dog");
		
			System.out.println(q);
		
	}
}