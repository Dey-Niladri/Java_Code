import java.util.Scanner;

public class TeenNumberChecker {

    public static void main( String[] args ) {
        System.out.println("Enter the first age : ");
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        System.out.println("Enter the second age : ");
        int age2 = sc.nextInt();
        System.out.println("Enter the third age : ");
        int age3 = sc.nextInt();
        sc.close();

        if ((age1 < 0 || age1 > 150) || (age2 < 0 || age2 > 150) || (age3 < 0 || age3 > 150)){
            System.out.println("The age you entered is invalid.");
            System.exit(1);
        }
            
        if(hasTeen(age1, age2, age3))
            System.out.println("There is a Teen");
        else
        System.out.println("There is np Teen");

        if(isTeen(age1))
            System.out.println("Age 1 : "+ age1 + " is a teenage girl.");
        else    
            System.out.println("Age 1 : "+ age1 + " is not a teenage girl.");

        if(isTeen(age2))
            System.out.println("Age 2 : "+ age2 + " is a teenage girl.");
        else
            System.out.println("Age 2 : "+ age2 + " is not a teenage girl.");

        if(isTeen(age3))
            System.out.println("Age 3 : "+ age3 + " is a teenage girl.");
        else
            System.out.println("Age 3 : "+ age3 + " is not a teenage girl.");
    }
    
    public static boolean hasTeen (int age1, int age2, int age3){
        if ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19))
            return true;
        else
            return false;
    }

    public static boolean isTeen(int age){
        if (age >= 13 && age <= 19){
            return true;
        }
        else 
            return false;
    }
}