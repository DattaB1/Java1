package PatternsPGS;

public class starpattern5
{
  public static void main(String[] args) 
  {
        // 
        for(int i=1;i<=4;i++)
        {
          for(int j=1;j<=i;j++)
          {
            System.out.print(" ");
          }
          //above code same as pattern1 pg because we create space like that

          // below code for star pattern where it compare with i  and decresed by --
          for(int k=4;k>=i;k--)
          {
            System.out.print("*");
          }
          System.out.println();
        }
  }
}