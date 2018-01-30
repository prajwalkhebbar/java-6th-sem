import java.util.Scanner;
public class stack{
	int a[]=new int[10];
	int top=-1;
	int len;
	public void push(int ele){
		if(top<10){
			a[++top]=ele;
		}
		else{
			System.out.println("overflow");
		}	
	}
	public void pop(){
		if(top>=-1){
			System.out.println("the poped element is:"+a[top]);
			top--;
		}
		else{
			System.out.println("underflow top is -1 ");
		}
	}
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String [] args){
		stack obj = new stack();
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("\n1:push,2:pop,3:display,4:exit");
		System.out.println("enter any option");
		int option = scan.nextInt();
		switch(option){
			case 1:	System.out.print("enter the element:");
				obj.push(scan.nextInt());
				break;
			case 2: obj.pop();
				break;
			case 3: obj.display();
				break;
			case 4: System.exit(0);
			default: System.out.println("enter the correct option next time");
		}
		}
	}
}
