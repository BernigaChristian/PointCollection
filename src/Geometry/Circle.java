package Geometry;

public class Circle {
	public final double PIGRECO=3.14;
	private Point p1;
	private Point p2;
	//constructors
	public Circle(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public Circle(Circle c) {
		this.p1=new Point(c.p1);
		this.p2=new Point(c.p2);
	}
	//getters
	public double getDiameter() {
		return Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()),2));											
	}
	public double getRay() {
		return this.getDiameter()/2;											
	}
	public double getPerimeter() {
		return getDiameter()*PIGRECO;											
	}
	public double getArea() {
		return Math.pow(this.getDiameter()/2,2)*PIGRECO;										
	}
	//setters
	public void setPoint1(double x,double y) {
		p1.setX(x);
		p1.setY(y);
	}
	public void setPoint2(double x,double y) {
		p2.setX(x);
		p2.setY(y);
	}
	//methods
	public String toString() {
		return "RAY: "+this.getRay()+"\nDIAMETER: "+this.getDiameter()+"\nPERIMETER: "+this.getPerimeter()+"\nAREA: "+this.getArea();
	}
}
