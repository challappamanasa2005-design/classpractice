import java.util.*;
public class Twod {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int age[][]=new int[2][5];
        for(int i=0;i<age.length;i++){
            for(int j=0;j<age[i].length;j++){
                System.out.println("enter the age of student " + j + "classroom " + i);
                age[i][j]=sc.nextInt();
            }
        }
        System.out.println("ages are:");
        for(int i=0;i<age.length;i++){
    for(int j=0;j<age[i].length;j++){
        System.out.println(age[i][j]);
    }
}
    }
    
}
