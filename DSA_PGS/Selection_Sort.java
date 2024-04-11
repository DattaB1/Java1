public class Selection_Sort
{
  public static void selectionsort(int arr[])
  {
      //outer loop
      for(int i=0;i<arr.length-1;i++)
      {
        //considering min position is our array
        int minPosition=i;
        for(int j=i+1;j<arr.length;j++)
        {
          //compare with privious one and then change the value if min value is show
          if(arr[minPosition]>arr[j])
          {
            minPosition=j;
          }
         
        }
        //swap
        int temp=arr[minPosition];
        arr[minPosition]=arr[i];
        arr[i]=temp;
      }
  }
  public static void printArr(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
    public static void main(String[] args) {
      int arr[]={10,20,40,5,60};
      selectionsort(arr);
      printArr(arr);

    }
}
