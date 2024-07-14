
//take an array as input from user.search  for given number x and print the index at index which occurs

import java.util.Scanner;

public class ArraybasicQ1 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int size=sc.nextInt();
    int num[]=new int[size];

    //input
    for(int i=0;i<size;i++)
    {
      num[i]=sc.nextInt();
    }

    int x=sc.nextInt();

    for(int i=0;i<num.length;i++)
    {
      if(num[i]==x)
      {
        System.out.println("X found at index"+i);
      }
    }
  }
}
