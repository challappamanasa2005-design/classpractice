import java.util.*;
import java.util.TreeSet;
class Car implements Comparable<Car>{
    int cost;

Car(int cost){
    this.cost=cost;
}
public String toString(){
    return "car[cost="+cost+"]";
}
public int compareTo(Car m){
    return this.cost - m.cost;
}
}
public class Exampleforcomparable {
    public static void main(String[] args) {
        Car c=new Car(1000000);
        Car c1=new Car(700000);
        Car c2=new Car(300000);
        TreeSet<Car> ts=new TreeSet<>();
        ts.add(c);
        ts.add(c1);
        ts.add(c2);
        for(Car i:ts){
            System.err.println(i);;
        }

    }
}
