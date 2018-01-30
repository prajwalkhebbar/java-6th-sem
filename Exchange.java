import java.util.*;
public class Exchange{
	int eid;
	String name;
	Exchange(){
		name=null;
		eid=0;
	}
	Exchange(String name,int id){
		this.name=name;
		eid=id;
	}
	public void swap(Exchange e1,Exchange e2){
		Exchange temp = new Exchange();
		temp = e1;
		e1=e2;
		e2=temp;
		System.out.print("e1: \t");
		e1.print();
		 System.out.print("e2: \t");
		e2.print();
	}
	public void print(){
		System.out.println("\tname:"+name+"\n \t id:"+eid);
	}
	public static void main(String args[]){
		Exchange emp1 = new Exchange("rahul",1098);
		Exchange emp2 = new Exchange("rashmi",2345);
		System.out.println("the employees before exchange are");
		emp1.print();
		emp2.print();
		emp1.swap(emp1,emp2);
	}
}
