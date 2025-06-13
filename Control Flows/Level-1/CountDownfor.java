public class CountDownfor {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--) {
            System.out.println(i);
        }
        System.out.println("Countdown finished!");
    }
    
}
