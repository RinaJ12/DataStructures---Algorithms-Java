package Spark_Group_Id.DataStructures.impl_in_java.Arrays;

public class SelectionSort {
	int arr[];
	int numElem;
	int numPasses;
	int numSwaps;
	
	 public SelectionSort(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size];
		numElem = 0;
	}
	
	public void insert(int data) {
		arr[numElem] = data;
		numElem++;
	}
	
	public void display()
	{
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public void swap(int curr,int next)
	{
		int temp=arr[curr];
		arr[curr]=arr[next];
		arr[next]=temp;
		numSwaps++;
	}
	
	public void selectionSort()
	{
		int pos;	
		boolean flag;
		for(int i=0;i<numElem;i++)
		{	
			flag=false;//saves num of swap func calls 
			pos = i;
			for(int j=i+1;j<numElem;j++)
			{
				numPasses++;				
				if(arr[pos]>arr[j])
					{					
					pos = j;
					flag=true;
					}
			}
			
			if(flag)
				swap(i, pos);
		}
	}
	
	public static void main(String[] args) {
		
		SelectionSort selSort = new SelectionSort(10);
		selSort.insert(100);
		selSort.insert(30);
		selSort.insert(5);
		selSort.insert(21);
		selSort.insert(130);
		selSort.insert(15);
		selSort.insert(29);
		selSort.insert(92);
		selSort.insert(48);
		selSort.insert(37);
		
		selSort.selectionSort();
		System.out.println("number of swaps happened :"+selSort.numSwaps);
		System.out.println("number of passes happened :"+selSort.numPasses);
		selSort.display();
	}
}
