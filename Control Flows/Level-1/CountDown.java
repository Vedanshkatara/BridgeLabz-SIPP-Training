import java.util.Scanner;
public class CountDown {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        System.out.println("Countdown finished!");
    }
}
