import java.util.*;

interface shape{
	public void getter();
	public void area();
	public void perimeter();
}

class circle implements shape{
	double r,a,p;
	public void getter(){
  		Scanner sc=new Scanner(System.in);
  		System.out.print("Enter the radius of the circle:");
  		r = sc.nextInt();
  	}
  	public void area(){
    	a = 3.14*r*r;
		System.out.println("Area of circle is "+a);
  	}
  	public void perimeter(){
  		p= 2*3.14*r;
  		System.out.println("Perimeter of circle is "+p);
  	}
}

class square implements shape{
	double l,a,p;
	public void getter(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lenght of the square:");
		l=sc.nextInt();
  	}	
  	public void area(){
		a=l*l;
		System.out.println("Area of square is "+a);
	}
  	public void perimeter(){
  		p=l*4;
  		System.out.println("Perimeter of square is "+p);
  	}
}

class triangle implements shape{
	double a,b,c,d,h,p;
	Scanner sc=new Scanner(System.in);
	public void getter(){
		System.out.print("Enter the base of triangle:");
		b=sc.nextDouble();
		System.out.print("Enter the height of triangle:");
		h=sc.nextDouble();
		System.out.print("Enter the first side of triangle:");
		d=sc.nextDouble();
		System.out.print("Enter the second side of triangle:");
		c=sc.nextDouble();
	}
	public void area(){
		a=0.5*b*h;
		System.out.println("Area of triangle is "+a);
	}
	public void perimeter(){
		p=a+b+c;
		System.out.println("Perimeter of triangle is "+p);
	}
}

class rectangle implements shape{
	int l,a,b,p;
	public void getter(){
  		Scanner sc=new Scanner(System.in);
  		System.out.print("Enter the lenght of the rectangle:");
  		l = sc.nextInt();
  		System.out.print("Enter the breadth of the rectangle:");
  		b = sc.nextInt();
  	}	
  	public void area(){
    	a = l*b;
		System.out.println("Area of rectangle is "+a);
  	}
  	public void perimeter(){
  		p = (l+b)*2;
  		System.out.println("Perimeter of rectangle is "+p);
  	}
}


public class AreaInterface{
 public static void main(String args[]){
	 int ch,wish;
	 circle cri=new circle();
	 square sqr=new square();
	 triangle tri=new triangle();
	 rectangle rec=new rectangle();
	 Scanner sc =new Scanner(System.in);
	 do
	 {
	  System.out.println("Menu\n1.Circle\n2.Square\n3.Triangle\n4.Rectangle");
	  System.out.print("Enter your choice:");
	  ch=sc.nextInt();
	  switch(ch){
	  	case 1:
	  		   cri.getter();
	  		   cri.area();
	  		   cri.perimeter();
	  		   break;
	  	case 2:
	  		   sqr.getter();
	  		   sqr.area();
	  		   sqr.perimeter();
	  		   break;	   
	  	case 3:
	  		   tri.getter();
	  		   tri.area();
	  		   tri.perimeter();
	  		   break;	
	  	case 4:
	  		   rec.getter();
	  		   rec.area();
	  		   rec.perimeter();
	  		   break;
	  	default:
	  	       System.out.println("Invalid choice");
	  	       break; 	   	   
	  }
	 System.out.print("Do you wish to continue(1/0):?");
	 wish=sc.nextInt();
	 }while(wish==1);
 }
}





