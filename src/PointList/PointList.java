package PointList;
import Geometry.Point;

public class PointList {
    Point[] points;
    //constructors
    public PointList(){points=new Point[30];}
    //methods
    public boolean isFree(int index){ return points[index]==null;}
    public int addPoint(Point point,int index){
        if(!isFree(index))  return -1;
        points[index]=point;
        return index;
    }
    public int removePoint(int index){
        if(isFree(index))  return -1;
        points[index]=null;
        return index;
    }
    public Point getPoint(int index){return new Point(points[index]);}
    public String toString(){
        String temp="";
        for(Point point:points)
            if(point!=null) temp+=point.toString();
        return temp;
    }
}
