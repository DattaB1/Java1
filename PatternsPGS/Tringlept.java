package PatternsPGS;

public class Tringlept {
  public static void main(String[] args) {
    //row loop
    for(int i=1;i<=4;i++)
    {
        for(int j=4;j>=i;j--)
        {
           System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }
  } 
}
