import java.util.*;
import java.util.Queue;
public class ExampleforQueue {
    public static void main(String[]args){
        Queue<Integer> s=new PriorityQueue<Integer>();//PriorityQueue pq=new PriorityQueue();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s);
        for(Object i:s){
            System.out.println(i);
        }

    }
}
