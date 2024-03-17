package PatternsPGS;

public class pyramind1 
{
  public static void main(String[] args) 
  {
    // for rows
    for(int i=1;i<=4;i++)
    {
          //for blank space
          for(int j=4;j>=i;j--)
          {
            System.out.print(" ");
          }

          //for* pattern
          for(int k=1;k<=i;k++)
          {
            System.out.print("*");
          }
          
          for(int m=2;m<=i;m++)
          {
            System.out.print("*");
          }
          System.out.println();
    }
  }  
}
