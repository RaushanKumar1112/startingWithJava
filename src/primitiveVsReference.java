import java.awt.*;
import java.util.Arrays;

public class primitiveVsReference {
    public static void  main(String[] args){
        // Point data type
        Point point1 = new Point(5,1);
        Point point2 = point1;
        point1.x = 6;
        point2.y=4;
        System.out.println(point2);

         //String data type
          String message = "  Hello world" + "!!  ";
          System.out.println(message.replace("!","*"));
          System.out.println(message.toLowerCase());
        System.out.println(message.trim().toUpperCase());
        String message1 = "Hello \"World\"";
        String path ="c:\\users\t\fun\\..";
        System.out.println(path);

       // Array Data type
         int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=4;
        int[] numbers1 = {1,3,4,5,7};
        System.out.println(Arrays.toString(numbers1));

       //  Two dimensional Array
        int [][] numbers2 =  new int[2][3];
        numbers2[0][0]=1;
        int [][] numbers3 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers3));

       //  Constant Variables
        final float PI = 3.14F;
        System.out.println(PI);


    }
}
