abstract class cat{
	abstract void eat();
}

public class Demo2 extends cat{
	public void eat(){
		System.out.println("A dog is eating not a cat");
	}
	public static void main(String args[]){
		cat obj = new Demo2();
		obj.eat();
	}
}
