import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
