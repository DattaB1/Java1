public class mergeSort
{
  //normal function to printing the array
	public static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//function for merge sort
	public static void mergesort(int arr[],int si,int ei)
	{
		//base case
		if(si>=ei)
		{
			return;
		}
		//kaam
		int mid=(si+ei)/2; 			 //	int mid=si+(ei-si)/2;
	
		mergesort(arr,si,mid); 		//left part
		mergesort(arr,mid+1,ei);   //right part mid+1 increase
		merge(arr,si,mid,ei);     //calling the method
		
		
	}
	public  static void merge(int[] arr, int si, int mid, int ei)
	{
		//left(0,3)=4 right(4,6)=3 ->6-0+1
		int temp[]=new int[ei-si+1];
		int i=si;  				 // iterator left patr
		int j=mid+1; 			//iterator for right part
		int k=0;     			// iterator for temp arry
		
		//0 to mid and  mid+1 to ei
		while(i<=mid && j<=ei)
		{
			if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				i++;k++;
			}
			else {
				temp[k]=arr[j];
				j++;k++;
			}
		}
		//left part
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		//right part
		while(j<=ei)
		{
			temp[k++]=arr[j++];
		}
		//copy temp to my original array
		for(k=0,i=si;k<temp.length;k++,i++)
		{
			arr[i]=temp[k];
		}
	}
	public static void main(String[] args) {
		int arr[]= {6,3,9,5,2,8};
		//mergesort(arr,si,ei);
		mergesort(arr,0,arr.length-1);
		printArr(arr);
	}
}
