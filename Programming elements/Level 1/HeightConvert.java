import java.util.Scanner;

public class HeightConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        
        double inches = heightCm / 2.54; // 1 inch = 2.54 cm
        int feet = (int) (inches / 12); // 1 foot = 12 inches
        inches = inches % 12;
        
        System.out.println("Your height in cm is " + heightCm + 
                           ", while in feet it is " + feet + 
                           " feet and " + inches + " inches.");
    }
}
