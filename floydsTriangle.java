/**
 * floydsTriangle
 */
public class floydsTriangle 
{
  public static void main(String[] args) 
  {
    int n=5;
    int number=1;;
    //outerLoop
    for(int i=1; i<=n; i++)
    {
      //innerloop
      for(int j=1; j<=i; j++)
      {
        System.out.print(number+" ");
        number++;
      }
        System.out.println();
    }
  }
}