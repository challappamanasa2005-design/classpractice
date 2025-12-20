import java.util.*;
public class Exampleforvector {
    public static void main(String[] args) {
        Vector<Object> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add("java");
        v.add("python");
        System.out.println(v.get(2));
        System.out.println("------------------------");
        System.out.println(v.contains("java"));
        System.out.println("-----------------------");
        System.out.println(v.isEmpty());
        System.out.println("----------------------");
        System.out.println(v.size());
       for(Object i:v){
        System.out.println(i);
       }
    }
}
