
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		/*If you want to add item arraylist is faster than linked list*/
		long arrayListStartTime = System.currentTimeMillis();
		fillArrayList(arrList);
		long arrayListfinishTime = System.currentTimeMillis();
		System.out.println("ArrayList time : "+ (arrayListfinishTime-arrayListStartTime));
		
		fillLinkedList(linkedList);
		long linkedListStartTime = System.currentTimeMillis();
		fillLinkedList(linkedList);
		long linkedListfinishTime = System.currentTimeMillis();
		System.out.println("linkedList time : "+ (linkedListfinishTime-linkedListStartTime));
		/*If you want to remove and add linked list is faster thane arraylist*/
		long arrayListRemoveStartTime = System.currentTimeMillis();
		removeArrayList(arrList);
		long arrayListRemovefinishTime = System.currentTimeMillis();
		System.out.println("ArrayList time : "+ (arrayListRemovefinishTime-arrayListRemoveStartTime));
		long linkedListRemoveStartTime = System.currentTimeMillis();
		removeLinkedList(linkedList);
		long linkedListRemoveFinishTime = System.currentTimeMillis();
		System.out.println("ArrayList time : "+ (linkedListRemoveFinishTime-linkedListRemoveStartTime));
		
	}
	/*region arraylist functions*/
	public static void fillArrayList(ArrayList<Integer> arrList) {
		for (int i = 0; i < 500000; i++) {
			arrList.add(i);
		}
	}
	public static void displayArrayList(ArrayList<Integer> arrList) {
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));	
		}
	}
	public static void removeArrayList(ArrayList<Integer> arrList) {
		for (int i = 0; i < 10000; i++) {
			arrList.remove(i);
		}
	}
	
	/*endRegion arraylist functions*/
	/*region linkedlist functions*/
	public static void fillLinkedList(LinkedList<Integer> linkedList) {
		for (int i = 0; i < 500000; i++) {
			linkedList.add(i);
		}
	}
	public static void removeLinkedList(LinkedList<Integer> linkedList) {
		for (int i = 0; i < 10000; i++) {
			linkedList.remove(i);
		}
	}
	/*endregion linkedlist functions*/
}
