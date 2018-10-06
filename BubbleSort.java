package Spark_Group_Id.DataStructures.impl_in_java.Arrays;

public class BubbleSort {
	
	int[] arr;
	int numElem;
	int numPasses=0;
	int numSwaps = 0;
	
	 BubbleSort(int size)
	{
		arr = new int[size];
		numElem=0;
	}
	 
	 void swap(int a,int b) {
		 int temp = arr[a];
		 arr[a]=arr[b];
		 arr[b]=temp;
		 numSwaps++;
	 }
	 
	 void insert(int data) {
		 arr[numElem]=data;
		 numElem++;
	 }
	 void  bubbleSort()
	 {
		 //moving biggest element from left to right
		for(int i=numElem-1;i>0;i--)
		 //for(int i=0;i<numElem-1;i++)//iterating whole loop
		 {
			 for(int j=0;j<i;j++)
			 {
				 numPasses++;
				 if(arr[j]>arr[j+1])
					 swap(j,j+1);
				 
			 }
		 }
		 //moving smallest element from right to left
		 /*for(int i=0;i<numElem-1;i++)
			 //for(int i=0;i<numElem-1;i++)
			 {
				 for(int j=numElem-1;j>i;j--)
				 {
					 numPasses++;
					 if(arr[j]<arr[j-1])
						 swap(j,j-1);
					 
				 }
			 }*/
	
	 }
	 public void display()
	 {
		 for(int i:arr)
			{
				System.out.print(i+" ");
			}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort bblSort = new BubbleSort(10);
		bblSort.insert(100);
		bblSort.insert(30);
		bblSort.insert(5);
		bblSort.insert(21);
		bblSort.insert(130);
		bblSort.insert(15);
		bblSort.insert(29);
		bblSort.insert(92);
		bblSort.insert(48);
		bblSort.insert(37);
		
		
		bblSort.bubbleSort();
		System.out.println("number of swaps happened :"+bblSort.numSwaps);
		System.out.println("number of passes happened :"+bblSort.numPasses);
		bblSort.display();
		
		
		
		 
	}

}
