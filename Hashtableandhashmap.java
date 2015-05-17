package collections;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class Hashtableandhashmap {
	public static void main(String args[]) {
		
  Hashtable<Integer, Student> stdTable = new Hashtable<Integer, Student>();
	stdTable.put(1, new Student("ABC",100));
	stdTable.put(2, new Student("QAZ",90));
	stdTable.put(3, new Student("WSD",80));
	stdTable.put(4, new Student("IKJ",98));
	stdTable.put(5, new Student("OPI",86));
	
DataInputStream dis = new DataInputStream(System.in);
	System.out.println("Enter roll no to get details:");

try {
	@SuppressWarnings("deprecation")
	int rollnumber = Integer.parseInt(dis.readLine());
Student std = stdTable.get(rollnumber);
System.out.println(std.getstdName()	+ " got " + std.getMarks());

} 
catch (NumberFormatException e) {
		e.printStackTrace();
} 
catch (IOException e) {
	e.printStackTrace();
}
/*
HashMap<Integer, Student> stdMap = new HashMap<Integer, Student>();
stdMap.put(1, new Student("ABC",100));
stdMap.put(2, new Student("QAZ",90));
stdMap.put(3, new Student("WSD",80));
stdMap.put(4, new Student("IKJ",98));
stdMap.put(5, new Student("AVX",86));

Set<java.util.Map.Entry<Integer, Student>> set = stdMap.entrySet();


Iterator<java.util.Map.Entry<Integer, Student>> i = set.iterator();

while(i.hasNext())
{
Entry<Integer, Student> entry= i.next();	
System.out.println("Key is " +entry.getKey());
System.out.println("Value is" +entry.getValue().toString());
}
*/
	
	}
}
