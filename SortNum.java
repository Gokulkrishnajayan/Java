import java.util.*;
class SortNum{
	public static void main(String[] args){
		int size,temp=0,arr[]=new int[20];
		System.out.println("Enter the size:");
		Scanner input=new Scanner(System.in);
		size=input.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<size;++i)
			arr[i]=input.nextInt();
			
		for(int i=0;i<size;++i)
		{
		 for(int j=i+1;j<size;++j)
		 {
		   if(arr[i]>arr[j])
		     {
	 		temp=arr[i];
 			arr[i]=arr[j]; 
			arr[j]=temp ;
		     }
		 }
		}
		System.out.println("Array in asending order is:");
		for(int i=0;i<size;++i)
		    System.out.println(arr[i]+" ");	
	}
}
