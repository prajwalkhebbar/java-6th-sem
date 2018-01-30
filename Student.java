import java.util.Scanner;
class Student{
int id;
String name;
double sal;
public void input(){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Your ID : ");
   id=sc.nextInt();
   System.out.print("Enter Your Name : ");
   name=sc.next();
   System.out.print("Enter Your Salary : ");
   sal=sc.nextDouble();
}
public void display(){
   Scanner sc = new Scanner(System.in);
   System.out.println("ID : "+id+"\tName:"+name+"\tSalary : "+sal);
   sc.close();
 }
public static void main(String [] args){
	System.out.println("enter the no of students");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Student st[] = new Student[n]; 
	for(int i=0;i<n;i++){
		st[i]=new Student();
		st[i].input();
	}
	for(int i=0;i<n;i++){
		st[i].display();
	}
}
}

