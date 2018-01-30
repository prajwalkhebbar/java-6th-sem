
public class bubble{
	public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		int len = n;
		int arr [] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(args[i+1]);
		}
		for(int i=0;i<len;i++){
			int temp=0;
			for(int j=1;j<len-i;j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int ele:arr){
			System.out.print(ele+" ");
		}
	}
}
