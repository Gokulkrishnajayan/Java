import java.util.Arrays;
import java.util.Scanner;

public class SortArray{
 public static void main(String args[]){
	int n;
	Scanner read=new Scanner(System.in);
	System.out.print("Enter the size of the array:" );
	n=read.nextInt();
	System.out.println("Enter the values:");
	String arr[]=new String[n];
	for(int i=0;i<n;++i){
		arr[i]=read.next();
	}
	Arrays.sort(arr);
	
	for(int i=0;i<n;++i){
		System.out.print(arr[i]+",");
	}	
 }
}

