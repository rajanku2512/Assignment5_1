import java.util.Scanner;

public class Assignment5_1 {

	public static void main(String[] args) {
int option;
System.out.println("enter the option to know the area and perimeter of 1.triangle/n 2.rectangle/n 3.circle");
Scanner answer=new Scanner(System.in);
option=answer.nextInt();
	if(option==1){
		double base,height;
		System.out.println("enter the value of height and base of triangle");
		Scanner ABC=new Scanner(System.in);
		base=ABC.nextDouble();
		height=ABC.nextDouble();
		figure figure;
		figure=new triangle();
		figure.findarea();
		figure.findperimeter();
		}
	else{
		if(option==2){
			figure figure;
			figure=new rectangle();
			figure.findarea();
			figure.findperimeter();
		}else{
			figure figure;
			figure=new circle();
			figure.findarea();
			figure.findperimeter();
		}
	}
			
		
		}


	}
abstract class figure{
	double dim1;
	abstract void findarea();
	abstract void findperimeter();
	
}
class triangle extends figure{

	@Override
	
	void findarea() {
		double base, area, height;
		area=base*height/2;
		System.out.println("area of triangle= "+area);
		
	}

	@Override
	void findperimeter() {
		float side1=2,side2=3,side3=4,perimeter;
		perimeter=side1+side2+side3;
		System.out.println("perimeter of triangle= "+perimeter);
	}
	
}
class rectangle extends figure{

	@Override
	void findarea() {
		float area,length=4,breadth=5;
		area=length*breadth;
		System.out.println("area of rectangle= "+area);
	}
	@Override
	void findperimeter() {
		float perimeter,length=4,breadth=5;
		perimeter=2*length+ 2*breadth;
		System.out.println("perimeter of rectangle= "+perimeter);
	}}
class circle extends figure{

	@Override
	void findarea() {
		double diameter=6,area;
		area=3.14*diameter*diameter/4;
		System.out.println("area of circle= "+area);
		}

	@Override
	void findperimeter() {
	double perimeter,diameter=6;
	perimeter=3.14*diameter;
	System.out.println("perimeter of circle= "+perimeter);
		}	}

