package Spark_Group_Id.DataStructures.impl_in_java.Arrays;

public class Arrays {

	public static int[] delete(int[] arrs,int key) {
		for(int i=0;i<arrs.length;i++)
		{
			if(key==arrs[i]) 
			{
				for(int j=i;j<=arrs.length-1;j++) {
					
					
						if(j==arrs.length-1)
						{
							arrs[arrs.length-1]=0;
							break;
						}
						arrs[j]=arrs[j+1];
				}
				break;
			}
		}
		return arrs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = new int[10];		
		arrs[0]=102;
		arrs[1]=104;
		arrs[2]=130;
		arrs[3]=65;
		arrs[4]=15;
		arrs[5]=70;
		arrs[6]=20;
		arrs[7]=30;
		arrs[8]=101;
		arrs[9]=110;
		int arr_len = arrs.length;
		
		int temp=0;
		for(int j=0;j<arr_len;j++)
		{
			for(int i=0;i<arr_len-1;i++)
			{
				if(arrs[i]>arrs[i+1])
				{
					temp = arrs[i];
					arrs[i]=arrs[i+1];
					arrs[i+1]=temp;
				}
					
			}
		}
		
		/*long s_time = System.currentTimeMillis();
		//deletion & no dups
		delete(arrs, 102);	
		arr_len=arr_len-1;
		long e_time = System.currentTimeMillis();		
		System.out.println(e_time-s_time);
		
		
		 s_time = System.currentTimeMillis();
		//deletion & no dups
		delete(arrs, 110);	
		arr_len=arr_len-1;
		 e_time = System.currentTimeMillis();	
		System.out.println(e_time-s_time);
*/
		/*for(int k=0;k<arrs.length;k++)
		{
			if(arrs[k]==100)
				System.out.println("key found!!");
			System.out.println(k+" : Still searching!!");
		}
		for(int i=0;i<arr_len;i++)
		{
			System.out.print(arrs[i]+" ");
						
		}
		*/
		int lb = 0;
		int ub = arrs.length-1;
		int key =130;
		int count =0;
		boolean flag = true;
		while(flag)
		{
			count++;
			int mid = (lb+ub)/2;
			if(arrs[mid]==key)
				{
				System.out.println("key found!!");
				flag = false;
				}
			if(lb>ub) {
				System.out.println("key not found");
				flag = false;
			}
			else {
					if(key<arrs[mid])
					{
						ub=mid-1;						
					}
					else {
						lb = mid+1;
					}
			}
		}
		System.out.println("Number of shuffles :"+count);
		
	}

}
