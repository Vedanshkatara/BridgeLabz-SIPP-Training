import java.util.Scanner;
public class Naturalnumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum=0;
            sum = n * (n + 1) / 2;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum); 
        } else {
            System.out.println("The number is not a natural number");
        }
    }
    
}
