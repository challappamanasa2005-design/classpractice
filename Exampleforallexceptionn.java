import java. util.*;
public class Exampleforallexceptionn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numerator");
        int n=sc.nextInt();
        System.out.println("enter the denominator");
        int d=sc.nextInt();
        try{
             int q=n/d;
             System.out.println("the result is:"+q);
        }
        catch(ArithmeticException e){
            System.out.println("no we cant divide by zero");
        }
        catch(NullPointerException e){
            System.out.println("there is no data");
        }
        catch(Exception e){
            System.out.println("we cant divide by zero");
        }

    }
}
    
