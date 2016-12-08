/*Storing Object in Array List*/
import java.util.*;

class Student{
	int age;
	String name;
	Student(int age, String name){
		this.age = age;
		this.name = name;
	}
}

public class Main{
   public static void main(String[] argv){
     ArrayList<Student> stu_info = new ArrayList<>(); 
     
     Student s1 = new Student(10,"ABC"); 
     Student s2 = new Student(20,"FGH"); 
     Student s3 = new Student(30,"DEF"); 
     Student s4 = new Student(40,"XCV"); 
     Student s5 = new Student(50,"QWE"); 
    
     stu_info.add(s1);
     stu_info.add(s2);
     stu_info.add(s3);
     stu_info.add(s4);
     stu_info.add(s5);
     for ( Student v : stu_info) System.out.println(v.age+" "+v.name);
     System.out.println("-----------------");
     stu_info.remove(s3);
     for ( Student v : stu_info) System.out.println(v.age+" "+v.name);
     
   }
}
