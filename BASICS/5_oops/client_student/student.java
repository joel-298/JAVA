//package basics_1;
//
//
//public class student {
//	String name;
//	int age;
//	
//	public void print() {
//		String name = "unique";
//		System.out.println("hey my name is " + name + " and my age is "+ age);
//
//	}
//	
//	public void student(String val1,int val2) {
//		System.out.println(val1,val2);
//	}
//
//}
package basics_1;

public class student {
    String name;
    int age;
    
    // Constructor to initialize the name and age
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print student details
    public void print() {
        System.out.println("Hey, my name is " + name + " and my age is " + age);
    }
}
