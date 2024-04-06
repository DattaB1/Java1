
public class FindSpecificArray
{
  public static void main(String[] args) {
    //print the num 7 that are in 2d array
		int arr[][]= {{4,7,8},{8,8,7}};
		int countof7=0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]==7)
        {
          countof7++;
        }
      }
    } 
    System.out.println("the count of 7 is:"+countof7);
  }
  
}