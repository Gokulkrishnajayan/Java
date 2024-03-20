abstract class shape{
	public abstract double calculateArea();
	
    public void displayinfo(){
    	System.out.println("This is a shape");
    }
}

class rectangle extends shape{
	int length;
	int breadth;
	
	public rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double calculateArea(){
		return length*breadth;
	}
}

class circle extends shape{
	int radius;
	public circle(int radius){
		this.radius=radius;
	}
	public double calculateArea(){
		return Math.PI*radius*radius;
	}		 
}

public class AbstractMain{
	public static void main(String[] args){
		shape rectangle =new rectangle(5,3);
		shape circle =new circle(4);
		System.out.println("Area of rectangle:"+rectangle.calculateArea());
		rectangle.displayinfo();
		System.out.println("Area of  circle:"+circle.calculateArea());
		circle.displayinfo();
	}
}
