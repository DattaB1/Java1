import java.util.Scanner;
//in this we write some block of code in perticular method then call it whenever we want.

public class FSum 
{

     static void m1()   //creating the method that take 2 inputs and add this number
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1=sc.nextInt();
        System.out.println("Enter the numbrer2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum:"+sum);
    }

    static void m2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();
        System.out.println("Enter thu num2");
        int num2=sc.nextInt();
        int mul=num1*num2;
        System.out.println("The mul is ::"+mul);

    }

    public static void main(String[] args) {
        m2();

    }
    
}
