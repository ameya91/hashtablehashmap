package collections;
import java.util.ArrayList;
public class ArrayListExample {

	private static final int ArrayList = 10;
	public static void main(String[] args) {
		ArrayList<String> strlist = new ArrayList <String>();
strlist.add("A");
strlist.add("B");
strlist.add("C");	
strlist.add("D");
strlist.add("E");	
strlist.add("F");

printArrayList(strlist);


	strlist.remove(4);

printArrayList(strlist);

	
	strlist.remove("F");

printArrayList(strlist);
	
	strlist.add(0,"-A");


printArrayList(strlist);
	}

	
	public static void printArrayList(java.util.ArrayList<String> strlist) {
		// TODO Auto-generated method stub
		for(String s: strlist) {
			System.out.println(s);
	}
		System.out.println("--------------------");
	}
}