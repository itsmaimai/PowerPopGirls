
import java.util.Scanner;
/**
 *
 * @author Student.admin
 */
public class addition extends display { 
    
    void result(){
        Scanner sum = new Scanner(System.in);
        
        System.out.println("ADDITION");
        
        System.out.print("Enter the first number: ");
        int x = sum.nextInt();
        
        System.out.print("Enter the second number: ");
        int y = sum.nextInt();
        
        int add = x + y;
        System.out.println("The total is " + add);
    }
}
