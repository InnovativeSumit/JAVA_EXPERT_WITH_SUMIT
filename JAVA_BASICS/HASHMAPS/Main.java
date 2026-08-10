import java.util.*;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Country , population
		//HashMap ==> unordered map
		HashMap<String, Integer> map = new HashMap<>();


		//Insertaion operation
		map.put("India", 120);
		map.put("US",10);
		map.put("UK",90);
		map.put("pakistan",120);
		System.out.println(map);

		// Update the values of the keys
		map.put("US",100);
		System.out.println(map);


		// Remove the key
		map.remove("UK");
		System.out.println(map);

		//Search / Lookup operation
		if(map.containsKey("India")) {
			System.out.println("key is present in the map");
		}
		else {
			System.out.println("key is not  present in the map");
		}


		// Check the values of keys
		// if Key is exist then print the value of keys
		System.out.println(map.get("India"));
		// if Key is not exist then print the "null"
		System.out.println(map.get("Bangladesh"));


		// Iteration in Hashmaps and prints the Keys
		for(Map.Entry<String,Integer> x : map.entrySet()) {
			System.out.print(x.getKey()+ " ");

		}

		System.out.print("\n");

		// Iteration in Hashmaps and prints the Values
		for(Map.Entry<String,Integer> x : map.entrySet()) {
			System.out.print(x.getValue()+ " ");

		}

		System.out.print("\n");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " " +  map.get(key));
		}

	}

}