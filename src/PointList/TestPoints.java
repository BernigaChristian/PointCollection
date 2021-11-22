//Berniga Christian 4D 20.11.21
package PointList;
import Geometry.Point;
import java.util.Random;

public class TestPoints {
    public static double randomDouble(){return new Random().nextDouble()+new Random().nextInt(50);}
    public static void main(String[] args) {
        PointList pointCollection=new PointList();
        for(int i=0;i<20;i++)
            pointCollection.addPoint(new Point(randomDouble(),randomDouble()),new Random().nextInt(30));
        System.out.println(pointCollection);
    }
}
