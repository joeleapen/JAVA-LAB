import java.util.*;
class Area{
	float length,breadth;
	Area(float length,float breadth){
		this.length=length;
		this.breadth=breadth;
	}
	float returnArea(){
		float area=length*breadth;
		return area;
	}

}
class Area4{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length:");
		float length=sc.nextFloat();
		System.out.println("enter the breadth:");
		float breadth=sc.nextFloat();
		Area rect=new Area(length,breadth);
		System.out.println("Area is:"+(rect.returnArea()));
	}
}

	
