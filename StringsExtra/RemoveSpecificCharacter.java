
import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        String result = str.replace(String.valueOf(ch), "");
        System.out.println("Modified String: " + result);
    }
}
