import java.util.*;
class Area{
	void area(float length,float  breadth)
	{
		System.out.println("Area of rectangle is:"+ (length*breadth));
	}

	void area(float radius)
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle is:"+(area));
	}
}
class Area1{
	public static void main(String []args)
	{
		Area obj=new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		float length =sc.nextFloat();
		System.out.println("Enter the breadth of rectangle:");
		float breadth =sc.nextFloat();
		obj.area(length,breadth);
		System.out.println("Enter the radius of the circle:");
		float radius =sc.nextFloat();
	        obj.area(radius);
		
	}
}