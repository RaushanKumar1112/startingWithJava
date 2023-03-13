import java.util.Scanner;

public class loops {
    public static void main(String[] args){
         for(int i=0;i<5;i++){
             System.out.println("Hello World");
        }

        int ii=0;
        while(ii<5){
            System.out.println("Hello World " + ii);
            ii++;
        }
          Scanner read = new Scanner(System.in);
          String input="";
          while(!input.equals("quit")){
              System.out.println("Input: ");
              input=read.next().toLowerCase();
              System.out.println(input);
          }

           String[] fruits = {"Apple","Mango","Orange"};
           for(int i=0;i<fruits.length;i++){
               System.out.println(fruits[i]);
           }
           for(String fruit : fruits){
               System.out.println(fruit);
           }
    }
}
