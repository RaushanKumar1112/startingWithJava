import java.awt.*;
public class primitiveVsReference {
    public static void  main(String[] args){
        Point point1 = new Point(5,1);
        Point point2 = point1;
        point1.x = 6;
        point2.y=4;
        System.out.println(point2);
    }
}
