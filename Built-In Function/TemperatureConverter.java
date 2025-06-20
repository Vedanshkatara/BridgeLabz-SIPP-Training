
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().toUpperCase().charAt(0);
        if (unit == 'C') {
            System.out.println("Converted to Celsius: " + toCelsius(temp));
        } else if (unit == 'F') {
            System.out.println("Converted to Fahrenheit: " + toFahrenheit(temp));
        } else {
            System.out.println("Invalid unit.");
        }
        scanner.close();
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
}
