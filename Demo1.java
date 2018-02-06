class A{
	int a;
	String info;
	A(int i)
	{
		a=i;
		info="hello from class A attribute";
		System.out.println("This is class A constructor");
	}
	public void print(){
		System.out.println(info);
	}
}
class B extends A{
	int b;
	String info;
	B(int j){
		super(200);
		b=j;
		info="hello from class B attribute";
		System.out.println("This is a class B constructor");
	}
	public void print(){
		System.out.println(info+"\nthe super info:"+super.info);
		
	}
}

public class Demo1{
	public static void main(String args[]){
		A obj1 = new B(100);
		obj1.print();
		
	}
}
