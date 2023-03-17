package Collections;

import java.util.HashMap;

public class mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> basket = new HashMap<String,Integer>();
		
		
		basket.put("item1",1);
		basket.put("item2",2);
		basket.put("item3",2);
		basket.put("item4",3);
		
		System.out.println("the map is " + basket);
		
		basket.put("item2", 4);
		
		System.out.println("the map after the change  is " + basket);
		
		basket.remove("item2");
		System.out.println("the map after the delete  is " + basket);
		
		basket.put("item5", null);
		System.out.println("the map after adding null value " + basket);
		
		for(String item:basket.keySet())
		{
			
			System.out.println(" the name in the basket is  " + item);
			System.out.println("item quantity is " + basket.get(item));
			
		}
		
		for(Integer val:basket.values()) {
			
			System.out.println(" the value is " + val);
		}
		
		String str = "clean world geern world happy world";
		
		String[] arr1 = str.split(" ");
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(String word:arr1) {
			
			if(!map1.keySet().contains(word)) {
				map1.put(word, 1);
			}else {
				map1.put(word,map1.get(word)+1);
				
			}
			System.out.println("The resulting map  is " + map1);

		}
		
		
		
		
		

	}

}
