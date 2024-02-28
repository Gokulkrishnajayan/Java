class MyClass {
	int a,b;
	MyClass(int x,int y){
		a=x;
		b=y; 
	}
	void display(){
		System.out.println("a="+a+"\nb="+b);
	}
}

public class Mainclass {
	public static void main(String[] args){
		MyClass obj=new MyClass(1,2);
		obj.display();
	}
}
