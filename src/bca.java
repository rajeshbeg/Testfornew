class Circle{
	int length;
	public Circle(int length)
	{
		this.length=length;
	}
	public int area(){
		return length*length;
	}
	
}

class Square{
	int redius;
	double pi=3.14;
	public Square(int redius)
	{
		this.redius=redius;
	}
	public double area(){
		return pi*redius*redius;
	}
}

public class bca{
	
	public static void main(String[]args){
		
		Circle c= new Circle(4);
		int CircleArea=c.area();
	System.out.println("Area of the circle is : "+CircleArea);
	
	Square s= new Square(3);
	double SquareArea=s.area();
	System.out.println("Area of the Square is : "+SquareArea);
	
	
	}
	
}