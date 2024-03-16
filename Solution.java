/*public class PRimeNumber02 {
  public static void main(String[] args) {
    int no=7;
    int temp=0;
    for(int i=2;i<=no-1;i++)
    {
      if(no%i==0)
      {
        temp=temp+1;
      }
    }
    if(temp==0)
    {
      System.out.println("no "+ np is prime);
    }
    else
    System.err.println(no+ );
  }
}*/

import java.util.Scanner;

public class Solution {
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String ans="";
      //even condtion is n%2==0
      if(n%1==0){
          System.out.println("even");
      }
      else{
          System.out.println("odd");
      }
  }
}