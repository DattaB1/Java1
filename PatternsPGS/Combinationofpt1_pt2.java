package PatternsPGS;

public class Combinationofpt1_pt2 
{
    public static void main(String[] args) 
    {
        //outerloop where i start with 1 and end with 4
        for(int i=1;i<=4;i++)
        {
          // inner loop where j start with 1 and j end with 1 i.e chechking the condition
          for(int j=1;j<=i;j++)
          {
            System.out.print("*");
          }
          System.out.println();
        }
        // above code are pattern 1 code


        //below code are pattern2
        for(int i=1;i<=4;i++)
        {
          for(int j=4;j>=i;j--)
          {
            System.out.print("*");
          }
          System.out.println();
        }
    }
}
