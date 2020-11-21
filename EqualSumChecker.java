import java.util.Scanner;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println("Enter the first number : ");
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int n3 = sc.nextInt();
        sc.close();

        if(hasEqualSum(n1,n2,n3))
            System.out.println("True");
        else
            System.out.println("False");
    }
    
    public static boolean hasEqualSum (int n1, int n2, int n3) {
        if ((n1 + n2) == n3)
            return true;
        else    
            return false;
    }
}
