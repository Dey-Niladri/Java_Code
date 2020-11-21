import java.util.Scanner;

public class MegaBytesConverter {

    public static void main (String[] args) {
        
        System.out.println("Please enter the number of kilobytes : ");
        Scanner sc = new Scanner(System.in);
        int kiloBytes = sc.nextInt();
        sc.close();
        printMegaBytesAndKiloBytes(kiloBytes);
    }
    
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes<0)
            System.out.println("Invalid Value");
        else 
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
    }

}
