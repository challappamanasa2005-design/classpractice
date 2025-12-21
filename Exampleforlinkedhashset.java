import java.util.*;
public class Exampleforlinkedhashset{
    public static void main(String[]args){
        LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(4);
        System.out.println(lh);
        for(Object i:lh){
            System.out.println(i);
        }
    }
}