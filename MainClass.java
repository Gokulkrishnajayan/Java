class MyClass{
	int a,b;
	MyClass(){
		a=10;
		b=20;
	}
	MyClass(int x,int y){
		a=x;
		b=y;
	}
	void display(){
		System.out.println("a="+a+"\nb="+b);
	}
}
public class MainClass{
	public static void main(String[] args){
	 MyClass obj=new MyClass();
	 MyClass obj1=new MyClass(100,200);
	 obj.display();
	 obj1.display();
	}
}
