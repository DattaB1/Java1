package PatternsPGS;

public class ReversePyamid
 {
  public static void main(String[] args)
   {  
      //for row
      for(int i=1;i<=4;i++)
      {
            //for blank space that start with 1 and end with 4
            for(int j=1;j<=i;j++)
            {
              System.out.print(" ");
            }

            //for * start with 4 and end with 1 so decrese
            for(int k=4;k>=i;k--)
            {
              System.out.print("*");
            }
            for(int m=3;m>=i;m--)
            {
              System.out.print("*");
            }
        System.out.println();
      }
   }
}
