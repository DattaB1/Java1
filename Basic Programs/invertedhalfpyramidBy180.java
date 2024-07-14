public class invertedhalfpyramidBy180
{
  public static void main(String[] args) 
  {
    int n=4;  
    //oouter loop 
    for(int i=1; i<=n; i++)
    {
      //inner loop
      for(int j=1;j<=n-1;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
}