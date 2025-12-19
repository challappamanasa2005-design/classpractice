import java.util.*;
class Demo2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("user thread is executing");
       try{    
        Thread.sleep(1000);
    }
    catch(Exception e){
        System.out.println("some error is occured");
    }
    }
}
}
class Demo3 extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("demon thraead is running");
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("some problem occured");
        }
    }
}
public class ExampleforTypesofThread {
    public static void main(String[] args) {
        System.out.println("main() started executing");
        Demo2 d2=new Demo2();
        Demo3 d3=new Demo3();
        d3.setDaemon(true);
        d2.start();
        d3.start();
        System.out.println("main() stopped working");
    }
}
