package PatternsPGS;

public class hollowPyramid {
  public static void main(String[] args)
  {

    //for row
    for(int i=5;i>=1;i--)
    {

        //space
          for(int j=5;j>i;j--)
          {
            System.out.print(" ");
          }

          // k for start
          for(int k=1;k<(i*2);k++)
          {
           
            if(k>1 && k<(i-2)-1)
            {
              System.out.print(" ");
            }
            else{
              System.out.print("*");
            }
          }



          //half pyramid start with 2
         /* 
         for(int m=2;m<=i;m++)
          {
            System.out.print("*");
          }
         */ 
      System.out.println();
    }
  }
}
