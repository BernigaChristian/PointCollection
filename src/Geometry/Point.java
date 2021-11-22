package Geometry;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Point {
    private double x;
    private double y;
    //constructors
    public Point() {
        x = 0.0;
        y = 0.0;
    }
    public Point(double x, double y) {
        this.x = (new BigDecimal(x).setScale(2,RoundingMode.HALF_UP).doubleValue());
        this.y = (new BigDecimal(y).setScale(2,RoundingMode.HALF_UP).doubleValue());
    }
    public Point(Point p) {
        this.x = (new BigDecimal(p.x).setScale(2,RoundingMode.HALF_UP).doubleValue());
        this.y = (new BigDecimal(p.y).setScale(2,RoundingMode.HALF_UP).doubleValue());
    }
    //getters
    public double getX() {return x;}
    public double getY() {return y;}
    public Point getPoint(){return this;}
    //setters
    public void setX(double x) {this.x=x;}
    public void setY(double y){this.y=y;}
    //methods
    public double distance() {return Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));}
    public double distance(Point p) {return Math.sqrt((Math.pow((p.x-x), 2))+(Math.pow((p.y-y), 2)));}
    public boolean equals(Point p){return x==p.x&&y== p.y;}
    public String toString() {return "("+x+";"+y+")";}
}

