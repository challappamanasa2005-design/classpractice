import java.util.*;
import java.util.Deque;
public class Exampleforarraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ar=new ArrayDeque<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar);
        System.out.println("------------------");
        System.out.println(ar.poll());
        System.out.println("--------------------------");
        for(Object i:ar){
            System.out.println(i);
        }
        System.out.println("-----------------------------");
        System.out.println(ar.remove(20));
        System.err.println(ar);
    }
}
