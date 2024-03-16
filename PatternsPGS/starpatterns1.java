package PatternsPGS;

public class starpatterns1 
{
  public static void main(String[] args) {

    //outer loop for rows
    for(int i=1;i<=10;i++)
    {

          //inner for coloums    
          for(int j=1;j<=i;j++)     //colum depend on rows
          {
            System.out.print("*");
          }
          System.out.println();

    }
  }
}
