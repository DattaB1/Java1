public class LargestArrayRecur {
  //Write a function here
  public static int getlargest(int numbers[])
  {
    int largest=Integer.MIN_VALUE;   //lowest value
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++)
    {
      if(largest<numbers[i])  //laregst se number of i bada huaa 
      {
         largest=numbers[i];
      }
      if(smallest>numbers[i])
      {
         smallest=numbers[i];
      }
    }
    return largest;
  }

  public static void main(String[] args)
   {
    int numbers[]={1,2,6,3,8,4};
    System.out.println("Largest value:-"+getlargest(numbers));
    System.out.println("Smallest value is:-"+smallest);
   }
}
