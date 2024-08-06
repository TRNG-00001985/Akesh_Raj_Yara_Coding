package Advance_Java;

import java.util.HashMap;
import java.util.Map;

public class CountElements {

	public static void main(String[] args) {
		HashMap <Integer,Integer> hm = new HashMap();
		int arr[] = {2,4,3,1,2,3,1,2};
		for(int i : arr) {
			if(hm.containsKey(i)) {
				hm.put(i,hm.get(i)+1);
			}
			else {
				hm.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> i : hm.entrySet()) {
				System.out.println(i);
		}
	}

}
