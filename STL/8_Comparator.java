
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class Student implements Comparable<Student> {
    String name ; 
    String address ; 
    public int compareTo(Student o){
        return (this.name).compareTo(o.name) ; // comparing dictionary type
    }
    public Student(String name, String address) { 
        this.name = name ; 
        this.address = address ; 
    }
    public String toString(){
        return "NAME : "+name+", ADDRESS : "+address ; 
    }

}

public class Main { // Comparator Demo
    public static void main(String[] args){
        Student s1 = new Student("JOEL","1095") ; 
        Student s2 = new Student("KASHISH","2903") ; 
        Student s3 = new Student("JATIN","2793") ; 

        ArrayList <Student> stu = new ArrayList<>() ; 
        stu.add( new Student("JOEL","1095")    ) ; 
        stu.add( new Student("KASHISH","2903") ) ; 
        stu.add( new Student("JATIN","2793")   ) ;

        Collections.sort(stu) ; 
        // Displaying the sorted list
        for (Student s : stu) {
            System.out.println(s);
        }
    }
}




// SORTED IN DECTIONARY ORDER : 
// NAME : JATIN, ADDRESS : 2793
// NAME : JOEL, ADDRESS : 1095
// NAME : KASHISH, ADDRESS : 2903