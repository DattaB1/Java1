public class QuickSort {
  // step -1 normal function to print array(loop)
	public static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//recursive function step 3 bt step 2 crete partition here
	public static void quicksort(int arr[],int si,int ei)
	{
		//base case
		if(si>ei)
		{
			return;
		}
		//last element on basis pivote
		int pidx=partition(arr,si,ei);
		quicksort(arr,si,pidx-1);  //left
		quicksort(arr,si,pidx+1);  // right
	}
	public static int partition(int arr[],int si,int ei)
	{
		int pivot=arr[ei];
		int i=si-1;     // to make place for els smaller than pivot
		
		for(int j=si;j<ei;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				
				//swap
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		return i;

	}

	public static void main(String[] args) {
		int arr[]= {6,3,9,8,2,5};
		quicksort(arr,0,arr.length-1);
		printArr(arr);
	}

}
 
