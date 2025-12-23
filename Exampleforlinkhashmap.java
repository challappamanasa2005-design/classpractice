import java.util.*;
public class Exampleforlinkhashmap {
    public static void main(String[] args) {
        Map<String,Object> m=new LinkedHashMap<String,Object>();//LinkedHashmap lhm=new LinkedHashMap();
        m.put("name","abc");
        m.put("age",21);
        System.out.println(m);
        System.out.println("-------------------");
        System.out.println(m.get(0));
        System.out.println("-------------------------");
        for(Object i:m.keySet()){
            System.out.println(i);
        }
        System.out.println("--------------------");
        for(Object i:m.entrySet()){
            System.out.println(i);
        }
    }
}
