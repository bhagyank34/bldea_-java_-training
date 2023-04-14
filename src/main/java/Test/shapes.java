package Test;
import java.util.Scanner;
abstract class shapes {
	double area;
	abstract void collect();
	abstract void calculate();
	void disp() {
		System.out.println(area);
	}

}
class Circle extends shapes{
	double pi=3.147;
	double r;
	void collect() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter radius");
		r=sc.nextDouble();
	}
	void calculate() {
		area=pi*r*r;
		
	}
	
}
class Rectangle extends shapes{
	double l,b;
	double r;
	void collect() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter length");
		l=sc.nextDouble();
		System.out.println("enter breadth");
		b=sc.nextDouble();
	}
	void calculate() {
		area=l*b;
		
	}
	
}
class Square extends shapes{
	double side;
	
	void collect() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the side");
		side=sc.nextDouble();
	}
	void calculate() {
		area=side*side;
		
	}
	
}
class Geometry{
	void permit(shapes s) {
		s.collect();
		s.calculate();
		s.disp();
	}
}
class launch{
	public static void main(String args[]) {
	Circle c=new Circle();	
	Rectangle r=new Rectangle();
	Square s=new Square();
	Geometry g=new Geometry();
	
	g.permit(c);
	g.permit(r);
	g.permit(s);
	
	}
}
		
	
