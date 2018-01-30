class sort{
	public static void main(String arg[])
	{
		int len=Integer.parseInt(arg[0]);
		int []a=new int[len];
		for(int i=1;i<=len;i++)
		{
			a[i-1]=Integer.parseInt(arg[i]);
		}
		int temp=0;
		for(int i=0;i<len;i++){
			for(int j=1;j<(len-i);j++){
				if (a[j-1]>a[j]){
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted array is");                                        //                                                                                                                     
		for(int i=0;i<len;i++)
		{	
			System.out.print("\t"+a[i]);
		}
	}
}
