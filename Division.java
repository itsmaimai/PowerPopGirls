import java.util.Scanner;
public class Division extends display{
    void result(){
        Scanner div = new Scanner(System.in);
        
        System.out.println("DIVISION");
        
        System.out.print("Enter the first number: ");
        int x = div.nextInt();
        
        System.out.print("Enter the second number: ");
        int y = div.nextInt();
        
        int division = x / y;
        System.out.println("The total is " + division);
    }
}
