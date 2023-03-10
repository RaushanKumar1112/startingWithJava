import java.util.Date;
public class Main {
    public static void main(String[] args){
        // primitive data types
        byte age = 12, temperature =29;
        age*=3;
        short numberOfEmployees=31234;
        int salary=123456789;
        long viewsCount = 3_123_456_789L;
        float price=10.99F;
        double priceNew=16.987;
        boolean isEligible = false;
        char letter = 'a';
        System.out.println(age);
        System.out.println(temperature);

        // references data types

        Date now=new Date();
        System.out.println(now);
    }
}
