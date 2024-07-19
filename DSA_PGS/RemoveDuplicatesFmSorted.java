/**
 * RemoveDuplicatesFmSorted
 */
public class RemoveDuplicatesFmSorted 
{
  public static void main(String[] args) 
  {
   // int[] nums = {0,1,1,1,2,2,3};
   int nums[]=new int[7];
   nums[0]=0;
   nums[1]=1;
   nums[2]=1;
   nums[3]=1;
   nums[4]=2;
   nums[5]=2;
   nums[6]=3;
   System.out.println(removeDuplicates(nums));
  }

  public static int removeDuplicates(int[] nums) 
  {
    int i = 0;              //start
    for(int j=1;j<nums.length;j++)  // j values may be chnages accoridn to valus 
    {
      if(nums[i]<nums[j])   //if the value found then
      {
        int temp=nums[i+1];
        nums[i+1]=nums[j];
        nums[j]=temp;
        i++;
      }
    }
    return i+1;
  }
}