import java.lang.Math;
class Triangle{
               int a=3,b=4,c=5;
	 	double s =(a+b+c)/2.0;
	 	double s1=(s)*(s-a)*(s-b)*(s-c);
	 	double area=Math.sqrt(s1);
	 
	 Triangle(){
	 	
	 	System.out.println("Perimeter is:"+(a+b+c));
	 	System.out.println("Area is:"+area);

	 }
}
class Triangle1{
	public static void main(String[]args)
	{
		new Triangle();
	}
}