import java.text.NumberFormat;

public class arithmeticOperations {
    public static void main(String[] args){
        int sum = 3+5;
        System.out.println(sum);
        int product = 5*6;
        System.out.println(product);
        int diff=65-34;
        System.out.println(diff);
        double quo=(double)10/(double)3;
        System.out.println(quo);
        sum++;
        System.out.println(sum);

        int x=10+3*2;
        System.out.println(x);

        // function inside math class are round,ceil,floor,max,min,random
         int result1 = (int)(Math.random()*100);
        System.out.println(result1);

        //Casting
        String str="2";
        int a = Integer.parseInt(str); // similar for short,float,double, long
        System.out.println(a);

        //Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String amount = currency.format(123345.546);
        System.out.println(amount);
    }
}
