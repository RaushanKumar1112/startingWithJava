import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = read.nextInt();
        System.out.print("Annual Interest Rate: ");
        float rate = read.nextFloat();
        System.out.print("Periods (Years):");
        short time = read.nextShort();
        rate/=12;
        rate/=100;
        time*=12;
        double calc =Math.pow((1+rate),time);
        double amount=principal*(rate*calc)/(calc-1);
        NumberFormat mortgage=NumberFormat.getCurrencyInstance();
        System.out.println(mortgage.format(amount));
    }
}
