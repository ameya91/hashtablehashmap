package collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Student> stdSet=new HashSet<Student>();

		stdSet.add(new Student("ABC",100));
		stdSet.add(new Student("QAZ",90));
		stdSet.add(new Student("WSD",80));
	stdSet.add(new Student("IKJ",98));
	stdSet.add(new Student("OPI",86));
	
for(Student s: stdSet)
{
System.out.println(s.toString());	

}

HashSet<String> strSet= new HashSet<String>();
strSet.add("A");
strSet.add("B");
strSet.add("C");
strSet.add("D");	
strSet.add("E");	
strSet.add("F");	
	if (strSet.contains("F")) {
		System.out.println("Member already exists");
	}
		else {
			strSet.add("F");
				}
	
	}
}

