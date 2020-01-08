
public class Main {

	public static void main(String[] args) {
		Integer[] intArr = {1,2,3};
		String[] strArr = {"Alper","Demir"};
		char[] charArr = {'a','l','p','e','r'};

		displayInt(intArr);
		displayStr(strArr);
		displayChar(charArr);
		System.out.println("****Generic*****");
		GenericDisplayArray<Integer> displayGenericInt = new GenericDisplayArray<>();
		displayGenericInt.displayGeneric(intArr);
		
		GenericDisplayArray<String> displayGenericStr = new GenericDisplayArray<>();
		displayGenericStr.displayGeneric(strArr);
		
		/*When you type char it has error because generic dont use primtive types*/
		//GenericDisplayArray<char> displayGenericChar = new GenericDisplayArray<>();
		
	}
	/*We write display methods for each data types*/
	/*With generic method we write only one method for all data types*/
	public static void displayInt(Integer[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	public static void displayStr(String[] str) {
		for (String string : str) {
			System.out.println(string);
		}
	}
	public static void displayChar(char[] c) {
		for (char d : c) {
			System.out.println(d);
		}
	}
	

}
