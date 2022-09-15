import java.util.Scanner;
public class Multiplication extends display{
  void result(){
        Scanner mul = new Scanner(System.in);
        
        System.out.println("MULTIPLICATION");
        
        System.out.print("Enter the first number: ");
        int x = mul.nextInt();
        
        System.out.print("Enter the second number: ");
        int y = mul.nextInt();
        
        int multiplication = x * y;
        System.out.println("The total is " + multiplication);
    }
}
