package Spark_Group_Id.DataStructures.impl_in_java.Arrays;

public class InsertionSort {
	int[] arr;
	int numElem;
	int numPasses=0;
	int numSwaps = 0;
	
	public InsertionSort(int data) {
		arr= new int[data];
		numElem=0;		
	}
	
	 void insert(int data) {
		 arr[numElem]=data;
		 numElem++;
	 }
	 
	 public void display()
	 {
		 for(int i:arr)
			{
				System.out.print(i+" ");
			}
	 }
	 
	 public void insertionSortMyVersion()
	 {
		 int marker;		 
		 for(int i=0;i<numElem-1;i++)
		 {
			 int pos=-1;
			 marker=arr[i+1];		 
			 for(int j=i+1;j>0;j--)
			 {
				 numPasses++;
				 if(marker<arr[j-1])
					 {
					 	numSwaps++;
						arr[j]=arr[j-1];
						// arr[j-1]=marker;	
						pos=j-1;
					 }					 
			 }			
			 if(pos>=0)
				 arr[pos]=marker;
		 }
	 }
	 
	 public void insertionSortBookVersion()
	 {
		 int in, out;
		 for(int i=0;i<numElem-1;i++)
			 for(out=1; out<numElem; out++) // out is dividing line
			 {
				 int temp = arr[out]; // remove marked item
				 in = out; // start shifts at out
				 numPasses++;
					 while(in>0 && arr[in-1] >= temp) // until one is smaller,
					 {
						 numSwaps++;
						 arr[in] = arr[in-1]; // shift item to right
						 --in; // go left one position
					 }
				 arr[in] = temp; // insert marked item
				 
			 } // end for			 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort insertSort = new InsertionSort(10);
		insertSort.insert(100);
		insertSort.insert(30);
		insertSort.insert(5);
		insertSort.insert(21);
		insertSort.insert(130);
		insertSort.insert(15);
		insertSort.insert(29);
		insertSort.insert(92);
		insertSort.insert(48);
		insertSort.insert(37);
		
		insertSort.insertionSortMyVersion();
		System.out.println("number of swaps happened :"+insertSort.numSwaps);
		System.out.println("number of passes happened :"+insertSort.numPasses);
		insertSort.display();
	}

}
