package Advance_Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableEx implements Comparable<ComparableEx> {
	
	String name;
	 int age;
	 
	 ComparableEx(String name, int age){
		 this.name = name;
		 this.age = age;
	 }
	 
	 public int compareTo(ComparableEx other) {
		return Integer.compare(this.age, other.age); 
	 }
	 public String toString() {
		 return name+" : "+age+" ";
	 }
	public static void main(String[] args)
 {
		List<ComparableEx> l = Arrays.asList(
				new ComparableEx("Akesh", 23),
				new ComparableEx("Bala", 21),
				new ComparableEx("Shiva", 24),
				new ComparableEx("Vinith", 22));
		
		Collections.sort(l);
		System.out.println(l);
	}
}
