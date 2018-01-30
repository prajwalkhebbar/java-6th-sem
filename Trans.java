import java.io.*;
import java.util.*;
class Trans{
public static void main(String arg[]){
int [][]a=new int[10][10];
int [][]b=new int[10][10];
Scanner sc=new Scanner(System.in);
System.out.println("enter no of rows");
int row=sc.nextInt();
System.out.println("enter no of coloumn");
int col=sc.nextInt();
int i,j;
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.println("enter element");
a[i][j]=sc.nextInt();
}
}
System.out.println("before tranpose matrix is");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("after tranpose matrix is");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(a[j][i]+"\t");
}
System.out.println();
}
}
}
