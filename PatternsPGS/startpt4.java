package PatternsPGS;

public class startpt4 
{
    public static void main(String[] args)
    {

        //outer loop 
        for(int i=1;i<=4;i++)
        {

          //loop for blank space start with 3 and decrese by 1 in each loop
          for(int j=3;j>=i;j--)
          {
            System.out.print(" ");
          }

          //loop for * pattern start with 1 and increase by 1 and compare with i i.r rows
          for(int k=1;k<=i;k++)
          {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}
