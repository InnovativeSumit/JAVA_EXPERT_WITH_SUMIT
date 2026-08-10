import java.util.*;
import java.util.HashMap;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Rollno , name
		//HashMap ==> unordered map
		HashMap<Integer, String> map = new HashMap<>();


		//Insertaion operation
		map.put(4,"Susmita");
		map.put(1,"sumit");
		map.put(2,"Sneha");
		map.put(3,"Kundu");
		map.put(3,"pal");
		map.put(3,"sen");
		map.put(4,"mehul");
		System.out.println(map);

		System.out.print("\n");
		// Update the values of the keys
		map.put(4,"");
		System.out.println(map);



		System.out.print("\n");
		// Remove the key
		map.remove(2);
		System.out.println(map);

		System.out.print("\n");
		boolean res = map.remove(1,"mehul");
		System.out.println("Removed ? "+ res);

		System.out.print("\n");
		//Search / Lookup operation
		if(map.containsKey(1)) {
			System.out.println("key is present in the map");
		}
		else {
			System.out.println("key is not  present in the map");
		}



		// 		System.out.print("\n");
		// 		Set<Integer> keys = map.keySet();
		// 		for(int key : keys) {
		// 			System.out.println(key + " " +  map.get(key));
		// 		}

		System.out.print("\n");
		for(int key : map.keySet()) {
			System.out.println(key + " " +  map.get(key));
		}

		System.out.print("\n");
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Map.Entry<Integer, String> i : entries) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}

		for (Map.Entry<Integer, String> i : entries) {
			i.setValue(i.getValue().toUpperCase());
		}
		System.out.println(map);






	}

}