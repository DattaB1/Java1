package PatternsPGS;

public class revrseDiagonal 
{
  public static void main(String[] args) 
  {
      //for loop    
      for(int i=1;i<=4;i++)
      {

        //for spaces decreseing
            for(int j=4;j>i;j--)
            {
              System.out.print(" ");
            }

            //for start pattern 1 to 4 increasing
            for(int k=1;k<=i;k++)
            {
                  if(i>=2 && k>1)
                  {
                    System.out.print(" ");
                  }
                  else{
                    System.out.print("*");
                  }
            }
            System.out.println();
      }
  }
}
