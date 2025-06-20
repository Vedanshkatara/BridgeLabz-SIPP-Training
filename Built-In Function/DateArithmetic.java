
import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2023, 1, 1);
        LocalDate modifiedDate = initialDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Initial Date: " + initialDate);
        System.out.println("Modified Date: " + modifiedDate);
    }
}
