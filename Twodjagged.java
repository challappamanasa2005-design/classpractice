import java.util.*;

public class Twodjagged {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age[][] = new int[2][];

        age[0] = new int[3];       
        age[1] = new int[5];

        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                System.out.println("Enter age of student " + j  + 
                                   " in classroom " + i );
                age[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nAges are:");
        for (int i = 0; i < age.length; i++) {
            System.out.print("Classroom " + i + ": ");
            for (int j = 0; j < age[i].length; j++) {
                System.out.print(age[i][j] + " ");
            }
            System.out.println();
        }
    }
}
