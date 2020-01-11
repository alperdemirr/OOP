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
		plakalar1.put(2, "Ad�yaman");
		plakalar1.put(4, "A�r�");
		plakalar1.put(6, "Ankara");
		plakalar1.put(5, "Amasya");
		//Add items to LinkedHashMap
		plakalar2.put(1, "Adana");
		plakalar2.put(3, "Afyon");
		plakalar2.put(2, "Ad�yaman");
		plakalar2.put(4, "A�r�");
		plakalar2.put(6, "Ankara");
		plakalar2.put(5, "Amasya");
		// When hashmap display values, it will consider to key
		displayMap(plakalar1);
		/*Output
		  Adana
		  Ad�yaman
	      Afyon
		  A�r�
		  Amasya
		  Ankara
		 */
		System.out.println("***************");
		// When LinkedHasMap display values, it will consider to added row
		displayMap(plakalar2);
		/* Output
		  Adana
		  Afyon
		  Ad�yaman
		  A�r�
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
