package collections;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashtabledemo {

	public static void main(String[] args) {
		Hashtable<Integer, Student> stdTableg = new Hashtable<Integer,Student>();
	stdTableg.put(1, new Student ("ABC",100));
	stdTableg.put(2, new Student ("okm",100));
	stdTableg.put(3, new Student ("put",100));
	
	DataInputStream dis = new DataInputStream(System.in);
	System.out.println("Enter Roll No to get student details");
int rollnumber = 0;
try {
	rollnumber = Integer.parseInt(dis.readLine());
} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
}
	Student std = stdTableg.get(rollnumber);
	System.out.println(std.getstdName() + " got " + std.getMarks());
	
	
	HashMap<Integer,Student> Stdmap = new HashMap<Integer, Student>();  
	Stdmap.put(1, new Student("QWERTY",95));
	Stdmap.put(2, new Student("Blackberry",90));
	Stdmap.put(3, new Student("VanHuesen",98));
	Stdmap.put(4, new Student("LouisPhillipe",85));
	
	Set<Entry<Integer, Student>> set = Stdmap.entrySet();
	Iterator<Entry<Integer, Student>> i=set.iterator();
	
	while(i.hasNext()){
				Entry<Integer, Student> enter=i.next();
	System.out.println("Key is:" +enter.getKey());
	System.out.println("Value is:" + enter.getValue());
	}
		
	}
}
