import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Principal (1K-1M): ");
        int principal = read.nextInt();
        while(principal<1_000 || principal>1_000_000){
            System.out.println("Enter a number between 1,000 and 1,000,000");
            System.out.print("Principal (1K-1M): ");
            principal = read.nextInt();
        }
        System.out.print("Annual Interest Rate: ");
        float rate = read.nextFloat();
        while(rate<1 || rate>30){
            System.out.println("Enter a number between 1 and 30");
            System.out.print("Rate: ");
            rate = read.nextFloat();
        }
        System.out.print("Periods (Years):");
        short time = read.nextShort();
        while(time<1 || time>30){
            System.out.println("Enter a number between 1 and 30");
            System.out.print("Time: ");
            time = read.nextShort();
        }
        rate/=12;
        rate/=100;
        time*=12;
        double calc =Math.pow((1+rate),time);
        double amount=principal*(rate*calc)/(calc-1);
        NumberFormat mortgage=NumberFormat.getCurrencyInstance();
        System.out.println(mortgage.format(amount));
    }
}
