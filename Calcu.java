
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum, secondNum;
        System.out.println("Enter the first number: ");
        firstNum = scan.nextInt();

        System.out.println("Enter second number: ");
        secondNum = scan.nextInt();

        System.out.println("Enter your choice: 1. Addition, 2. substraction 3. Multiplication and 4. Division:");
        int choose;
        choose = scan.nextInt();
        scan.close();
        switch (choose) {
            case 1:
                System.out.println("The result is: " + add(firstNum, secondNum));
                break;

            case 2:
                System.out.println("The result is: " + sub(firstNum, secondNum));
                break;
            case 3:
                System.out.println("The result is: " + mult(firstNum, secondNum));
                break;
            case 4:
                System.out.println("The result is: " + div(firstNum, secondNum));
                break;
            default:
                System.out.println("Error, Please see the choices provided");
        }
    }

    public static int sub(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        return result;
    }

    public static int add(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }
}