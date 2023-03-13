import java.util.Scanner;

public class readingInputs {
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Name: ");
        //nextByte for byte input similarly nextInt,nextLong ....
        String name = read.nextLine();
        System.out.println("Your are " + name.trim());
    }
}
