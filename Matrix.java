import java.util.Scanner;
class Matrix{
public static void main(String args[]){
int a[][]=new int[20][20];
int b[][]=new int[20][20];
int c[][]=new int[20][20];
int i,j,n,m;
System.out.println("enter the size of first array:");
Scanner read= new Scanner(System.in);
n=read.nextInt();
System.out.println("Enter the elements:");
for(i=0;i<n;i++){
for(j=0;j<n;j++){
a[i][j]=read.nextInt();
}
}
System.out.println("enter the size of second array:");

m=read.nextInt();
System.out.println("Enter the elements:");
for(i=0;i<m;i++){
for(j=0;j<m;j++){
b[i][j]=read.nextInt();
}
}
System.out.println("the first array is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("the second array is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("addition of matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
