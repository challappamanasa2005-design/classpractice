import java.util.*;
class Family implements Runnable{
    String resource1="tv";
    String resource2="playstation";
    public void run(){
        String name=Thread.currentThread().getName();
        if(name.equals("manasa")==true){
            manasaAccquriedResource();
        }
        else{
            gunaAccquiredResource();
        }
    }
    void manasaAccquriedResource(){
        synchronized(resource2){
            try{
                System.out.println("manasa accquired the playststion");
                Thread.sleep(2000);
                synchronized(resource1){
                    System.out.println("manasa accquired Tv");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e){
                System.out.println("guna failed");
            }
        }
    }
    void gunaAccquiredResource(){
    synchronized(resource1){
        try{
            System.out.println("guna accquired the tv");
            Thread.sleep(2000);
            synchronized(resource2){
                System.out.println("guna accquired playststion");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("manasa failed");
        }
    }
}
}
public class Examplefordeadlock {
    public static void main(String[] args) {
        Family f= new Family();
        Thread t1=new Thread(f);
        Thread t2=new Thread(f);
        t1.setName("manasa");
        t2.setName("guna");
        t1.start();
        t2.start();
    }
    
}
