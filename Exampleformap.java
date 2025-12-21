import java.util.*;
public class Exampleformap {
    public static void main(String[] args) {
        Map <String,String> m=new HashMap<String,String>();//HashMap hm=new HashMap();
        m.put("name","manasa");
        m.put("place","Tirupati");
        System.out.println(m);
        System.out.println("---------------");
        System.out.println(m.get("name"));
        System.out.println("----------");
        System.out.println(m.get("place"));
        System.out.println("-------------------");
        for(Object i:m.values()){
            System.out.println(i);
        }
        System.out.println("---------------");
        for(Object i:m.entrySet()){
            System.out.println(i);
        }
    }
}
