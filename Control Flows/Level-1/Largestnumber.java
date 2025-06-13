import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("The first number is the largest");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The second number is the largest");
        } else {
            System.out.println("The third number is the largest");
        }
    }
}
