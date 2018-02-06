interface animals{
	void eat();
}
class cat implements animals{
	public void eat(){
		System.out.println("A cat is eating");
	}
}
class dog implements animals{
	public void eat(){
		System.out.println("A dog is eating");
	}
}
public class Demo3{
	
	public static void main(String args[]){
		animals c = new cat();
		animals d = new dog();
		c.eat();
		d.eat();	
	}
}
