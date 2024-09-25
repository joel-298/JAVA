// DO QUESTIONS BASED ON SORTING THE STRING ARRAY , wrt different conditions ; 

import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "pear", "kiwi", "orange"};

        // Sort the array based on the length of strings
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        // Output the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
















// SIR'S GITHUB CODE : for now we are just going to stuck on the above part of the code present int this file
package lec45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // Sorting by age in ascending order
        return o1.age - o2.age;
    }
}

class ReverseAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // Sorting by age in descending order
        return o2.age - o1.age;
    }
}

public class ComparableVsComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Akshit", 20, "Ambala"));
        students.add(new Student("Akash", 12, "Chandigarh"));
        students.add(new Student("Aman", 40, "Mohali"));
        students.add(new Student("Himanshu", 30, "Rajpura"));

        // Sorting by name using Comparable (default sorting)
        Collections.sort(students);
        System.out.println("Sorted by name (Comparable):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by age using Comparator (ascending)
        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by age (Ascending, Comparator):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by age using Comparator (descending)
        Collections.sort(students, new ReverseAgeComparator());
        System.out.println("\nSorted by age (Descending, Comparator):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}