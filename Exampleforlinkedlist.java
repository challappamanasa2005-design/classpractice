import java.util.*;
public class Exampleforlinkedlist {
    public static void main(String[] args) {
        List<Object> ll=new LinkedList<>();
        ll.add(30);
        ll.add(30);
        ll.add(40);
        ll.add("java");
        for(object i:ll){
            System.out.println(i);
        }
        System.out.println("________________________");
        List<Object> ll1=new LinkedList<>();
        ll1.add(40);
        ll1.add(50);
        ll.add("java");
        for(Object i:ll1){
            System.out.println(i);
        }
    }
}
