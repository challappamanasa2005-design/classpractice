import java.util.*;
class InvalidUserException extends Exception{
  public String getMessage(){
     return "Inavalid details try again";
    
  }
}
class Atm{
    int acc_no=1234578;
    int password=271005;
    int AN,PWD;
    void acceptInput(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the account no:");
        AN=sc.nextInt();
        System.out.println("enter password:");
        PWD=sc.nextInt();
    }
    void verify() throws InvalidUserException{
        if(acc_no==AN && password==PWD){
            System.out.println("the accno and password is correct");
        }
        else{
            InvalidUserException i= new InvalidUserException();
            System.out.println(i.getMessage());
            throw i;
        }
    }
}
class Bank1{
        void intiate(){
            Atm a=new Atm();
            try{
             a.acceptInput();
             a.verify();
            } 
            catch(Exception e){
                try{
             a.acceptInput();
            a.verify();
                }
                catch(Exception b){
                         try{
            a.acceptInput();
            a.verify();
                } 
                catch(Exception c){
                    System.out.println("card was blocked");
                }
            }
        }
}
}
public class Exampleforcusttomexception {
    public static void main(String[] args) {
        Bank1 b =new Bank1();
        b.intiate();
    }
}
