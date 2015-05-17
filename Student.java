package collections;

public class Student {
	String stdName;
	int marks;
	
		public Student(String stdName, int marks) {
			
			this.stdName = stdName;
			this.marks = marks;
		}
		
		public String getstdName(){
		return stdName;		
		}
		
		public void setStdname(String stdName) {
			this.stdName = stdName;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		
	}
		@Override
public String toString(){
	return stdName+" "+marks;
	
}


}
	
	
