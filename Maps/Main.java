import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> plakalar1 = new HashMap<Integer, String>();
		Map<Integer, String> plakalar2 = new LinkedHashMap<Integer, String>();
		//Add items to HashMap
		plakalar1.put(1, "Adana");
		plakalar1.put(3, "Afyon");
		plakalar1.put(2, "Adýyaman");
		plakalar1.put(4, "Aðrý");
		plakalar1.put(6, "Ankara");
		plakalar1.put(5, "Amasya");
		//Add items to LinkedHashMap
		plakalar2.put(1, "Adana");
		plakalar2.put(3, "Afyon");
		plakalar2.put(2, "Adýyaman");
		plakalar2.put(4, "Aðrý");
		plakalar2.put(6, "Ankara");
		plakalar2.put(5, "Amasya");
		// When hashmap display values, it will consider to key
		displayMap(plakalar1);
		/*Output
		  Adana
		  Adýyaman
	      Afyon
		  Aðrý
		  Amasya
		  Ankara
		 */
		System.out.println("***************");
		// When LinkedHasMap display values, it will consider to added row
		displayMap(plakalar2);
		/* Output
		  Adana
		  Afyon
		  Adýyaman
		  Aðrý
		  Ankara
		  Amasya
		 */
	}

	public static void displayMap(Map<Integer,String> map) {
		for (String iterable_element : map.values()) {
			System.out.println(iterable_element);
		}
	}
	

}
