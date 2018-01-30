import java.util.*;
public class max{
	public static void large(int ...x){
		int lar = x[0];
		for(int i: x){
			if(i>lar){
				lar=i;
			}
		}
		System.out.println("largest no is:"+lar);
	}
	public static void main(String args[]){
		large(1,2,3,45,423,3515,1556,2325,3536,10000);
	}
}
