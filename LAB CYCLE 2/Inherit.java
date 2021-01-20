class Parent{
	void printParent(){
		System.out.println("This is parent class");
	}
}
class child extends Parent{
	void printChild(){
		System.out.println("This is child class");
	}
}
class Inherit{
	public static void main(String[]args){
		Parent obj1=new Parent();
		child obj2= new child();
		obj1.printParent();
		obj2.printChild();
		obj2.printParent();

	}
}