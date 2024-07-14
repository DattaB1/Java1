public class halfPyramidwithNum
{
  public static void main(String[] args) {
    int n=4;

    //outerloop for row  (here i=n and j=i)
    for(int i=1; i<=5; i++)
    {
      //innerLoop
      for(int j=1; j<=i; j++)
      {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }  
}
