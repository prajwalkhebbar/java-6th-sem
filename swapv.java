import java.lang.*;
class Emp{
int id1,id2;
Emp(int id1,int id2){
this.id1=id1;
this.id2=id2;
}
 static void swap(Emp e1)
{
int t=e1.id1;
e1.id1=e1.id2;
e1.id2=t;
}
}
class swapv{
public static void main(String arg[])
{
Emp e1=new Emp(10,15);
System.out.println("before swapping  emp1 id1: "+e1.id1+" emp1 id2: "+e1.id2);

e1.swap(e1);
System.out.println("after swapping  emp1 id1: "+e1.id1+" emp1 id2: "+e1.id2);
}
}
