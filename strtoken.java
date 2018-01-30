import java.util.*;
import java.io.*;
import java.lang.*;
public class strtoken{
	public static void main(String [] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the employee details with : inbetween");
		String a = br.readLine(); 
		StringTokenizer st = new StringTokenizer(a,":");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
