import java.util.*;
class BankAcc{
private double bal;
BankAcc(double b){
bal=b;
}
void contact(double r) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the password");
String pass=sc.next();
if(pass.equals("abc123")){
Inter in=new Inter(r);
in.calculate();
}
else{
System.out.println("invalid password");
}
}
private class Inter{
private double rate;
Inter(double r){
rate=r;
}
void calculate(){
double interest=bal*rate/100;
bal+=interest;
System.out.println("updated balance :"+bal);
}
}
}
class Inner{
public static void main(String arg[]){
BankAcc ba=new BankAcc(5678);
ba.contact(15);
}
}

