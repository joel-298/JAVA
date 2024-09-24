//package basics_1;
//
//public class client {
//
//	public static void main(String[] args) {
//		student s = new student();
//		s.name = "kashish";
//		s.age = 20;
//		s.print();
//		
//		student s1 = new student();
//		s1.name = "joel";
//		s1.age = 20;
//		s1.print();
//		student s3 = new student("kashish",23);
//	}
//
//}

package basics_1;

public class client {

    public static void main(String[] args) {
        // Create student s
        student s = new student("kashish", 20);
        s.print();
        
        // Create student s1
        student s1 = new student("joel", 20);
        s1.print();
        
        // Create student s3
        student s3 = new student("kashish", 23);
        s3.print(); // This will print the details of s3
    }
}
