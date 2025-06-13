import java.util.Scanner;
public class Smallestnumber {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
         int n2=sc.nextInt();
         int n3=sc.nextInt();
         if(n1<n2 && n1<n3){
            System.out.println("the first number is the smallest");

         }
         else{
            System.out.println("the first number is not the smallest");
         }
    }

}
