import java.util.Scanner;

public class SpeedConverted {

    public static void main(String[] args) {
        System.out.println("Enter the speed in Km/h : ");
        Scanner sc = new Scanner(System.in);
        double  kilometersPerHour = sc.nextDouble();
        sc.close();
        
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(milesPerHour);
        printConversion(kilometersPerHour);
    }
    

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        else 
            return (Math.round(kilometersPerHour/1.609));
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h") ;
    }
}
