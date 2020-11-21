import java.util.Scanner;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double secondNumber = sc.nextDouble();
        sc.close();
        
        if(areEqualByThreeDecimalPlaces(firstNumber,secondNumber))
            System.out.println("The numbers are equal up to 3 decimal places.");
        else
        System.out.println("The numbers are not equal up to 3 decimal places.");
    }
    
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        if ((int)(firstNumber*1000)==(int)(secondNumber*1000))
            return true;
        else 
            return false;
    }
}
