import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int num=sc.nextInt();

        if(num<50)
        {
            System.out.println("Fail");
        }
        else if(num>=50 && num<60)
        {
            System.out.println("D grade");
        }
        else if(num>=60 && num<70)
        {
            System.out.println("C grade");
        }
        else if(num>=70 && num<80)
        {
            System.out.println("B grade");
        }
        else if(num>=80 && num<90)
        {
            System.out.println("A grade");
        }
        else if(num>=90 && num<100)
        {
            System.out.println("A++");
        }
        else{
            System.out.println("Invalid marks ");
        }
    }
    
}
