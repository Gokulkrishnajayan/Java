import java.util.*;
class ArrayIn{
	public static void main(String[] args){
		int size,a[]=new int[10];
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the size:");
		size=input.nextInt();
		
		System.out.println("Enter the Elements:");
		for(int i=0;i<size;++i)
			a[i]=input.nextInt();
			
		System.out.println("Array ELements:")	;
		for(int i=0;i<size;++i)
			System.out.println(a[i]);	
	}
}
