import java.util.Scanner;

public class _2DArraybasic
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rows");
    int rows=sc.nextInt();

    System.out.println("Enter the colums");
    int coloums=sc.nextInt();
  
    int num[][]=new int[rows][coloums];

    //input
    //rows
    for(int i=0; i<rows; i++)
    {
      //colums
      for(int j=0; j<coloums; j++)
      {
        num[i][j]=sc.nextInt();
      }
    }

    //output
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<coloums;j++)
      {
        System.out.print(num[i][j]+" ");
      }
      System.out.println();
    }
    
 } 
}
