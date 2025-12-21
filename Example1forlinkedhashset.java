import java.util.*;
class Student{
    private String rollno;
    private String name;
    private String email;
    Student(String rollno,String name,String email){
        this.rollno=rollno;
        this.name=name;
        this.email=email;
    }
    public String getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String toString(){
        return "student rollno is: "+rollno +" student name is: "+name +" student mail is: "+email;
    }
}
public class Example1forlinkedhashset {
    public static void main(String[] args) {
        Student s=new Student("23Ak1a3623", "manasa", "challappa@27");
        LinkedHashSet <Student> hs=new LinkedHashSet<Student>();
        hs.add(s);
        for(Object i:hs){
            System.out.println(i);
        }


    }
}
