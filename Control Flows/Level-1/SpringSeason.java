import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day < 21)) {
            System.out.println("Spring Season");
        } else {
            System.out.println("Not Spring Season");
        }
    }
}
