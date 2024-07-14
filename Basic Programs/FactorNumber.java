import java.util.Scanner;

public class FactorNumber 
{
    //factorNumber
    public static void main(String[] args)
    {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Num");
        int a=sc.nextInt();*/


        // Factor Number printing//
       /*  for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            System.out.println(i);  
        }*/
        

        //Addition of factor//
       /* int total=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            total=total+i;
        }
        System.out.println(total);
        */

        //check wheather number is perfect or not
        /*int total=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
                total=total+i;
        }
        if(total==a)
            System.out.println("Given Number is perfect Number");
        else
        System.out.println("Given Number is not perfects");
        */

        // display all perfect num bet 1 and 1000

        for(int a=1;a<=1000;a++){
            int total=0;
            for(int i=1;i<a;i++){
                if(a%i==0)
                    total=total+i;
            }
            if(total==a)
                System.out.println(a);
        }

    }
    
}
