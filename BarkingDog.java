import java.util.Scanner;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println("Is the dog barking ? True/False : ");
        Scanner sc = new Scanner (System.in);
        boolean barking = sc.nextBoolean();
        System.out.println("What is the time now ? Enter the hour of the day : ");
        int hourOfDay = sc.nextInt();
        sc.close();
        boolean shouldWeWakeUp = shouldWakeUp(barking,hourOfDay);

        if(shouldWeWakeUp)
            System.out.println("Please wake up !");
        else
            System.out.println("No need to wake up");
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking && (((hourOfDay >=0 && hourOfDay < 8))||(hourOfDay > 22 && hourOfDay <= 23)))
            return true;
        else
            return false;
    }
}
