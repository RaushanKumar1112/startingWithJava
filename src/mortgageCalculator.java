import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args){
        int principal = (int)readNumber("Principal (1K-1M): ",1_000,1_000_000);
        float annualInterest = (float)readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte)readNumber("Periods (Years):",1,30);
        calculateMortgage(principal,annualInterest,years);
    }
    public static double readNumber(String prompt,double min,double max){
        Scanner read=new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = read.nextFloat();
            if(value>=min && value<=max)break;
            System.out.println("Enter a number between " + min + " and "+max);
        }
        return value;
    }
    public static void calculateMortgage(int principal,float annualInterest,
                                           byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        annualInterest/=MONTHS_IN_YEAR;
        annualInterest/=PERCENT;
        years*=MONTHS_IN_YEAR;
        double calc =Math.pow((1+annualInterest),years);
        double amount = (principal * (annualInterest * calc)) / (calc - 1);
        String mortgage=NumberFormat.getCurrencyInstance().format(amount);
        System.out.println("Mortgage: " + mortgage);
        paymentSchedule(principal,annualInterest,years);
    }
    public static void paymentSchedule(int principal,float annualInterest,byte years){
        int numberOfPaymentsDone=1;
        while(true){
            double amount = principal*(Math.pow(1+annualInterest,years)-
                    Math.pow(1+annualInterest,numberOfPaymentsDone))
                    /(Math.pow(1+annualInterest,years)-1);
            numberOfPaymentsDone++;
            if(amount<0)break;
            String remainingPayment=NumberFormat.getCurrencyInstance().format(amount);
            System.out.println(remainingPayment);
        }
    }
}
