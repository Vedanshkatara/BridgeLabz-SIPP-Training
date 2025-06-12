public class fees {
    public static void main(String[] args){
        int totalfees = 125000;
        double discount = 0.1 * totalfees; // 10% discount on remaining fees
        double finalamount = totalfees - discount;

        System.out.println("Total Fees: " + totalfees);
        System.out.println("Discount on total fees: " + discount);
        System.out.println("Final Amount to be Paid: " + finalamount);
    }
}
