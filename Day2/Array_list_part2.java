/*Add all and remove all*/
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
     ArrayList<Student> stu_db = new ArrayList<>();
     
     Student s1 = new Student(10,"ABC"); 
     Student s2 = new Student(20,"FGH"); 
     Student s3 = new Student(30,"DEF"); 
     Student s4 = new Student(40,"XCV"); 
     Student s5 = new Student(50,"QWE"); 
    
     Student x1 = new Student(10,"---"); 
     Student x2 = new Student(20,"+++"); 
     
     stu_info.add(s1);
     stu_info.add(s2);
     stu_info.add(s3);
     stu_info.add(s4);
     stu_info.add(s5);
     
     stu_db.add(x1);
     stu_db.add(x2);
     
     System.out.println("All Object");
     for ( Student v : stu_info) System.out.println(v.age+" "+v.name);
     System.out.println("+++++++++++++++++");
     for ( Student v : stu_db) System.out.println(v.age+" "+v.name);
     System.out.println("-----------------");
     
     stu_info.addAll(stu_db);
     for ( Student v : stu_info) System.out.println(v.age+" "+v.name);
     
   }
}
