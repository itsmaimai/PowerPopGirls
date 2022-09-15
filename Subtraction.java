import java.util.Scanner;
public class Subtraction extends display{
     void result(){
        Scanner sub = new Scanner(System.in);
        
        System.out.println("SUBTRACTION");
        
        System.out.print("Enter the first number: ");
        int x = sub.nextInt();
        
        System.out.print("Enter the second number: ");
        int y = sub.nextInt();
        
        int subtraction = x - y;
        System.out.println("The total is " + subtraction);
    }
}
