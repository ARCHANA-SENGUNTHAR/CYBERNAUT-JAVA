//ASG-1
//2.)Receive your name as input and print it
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Creating scanner class 
        
        Scanner name = new Scanner(System.in);
        
        // Prompting to enter name 
        
        System.out.print("Input the name Archana: ");
        
        String user = name.next();
        
        System.out.println();
        System.out.println(user);
    }
}