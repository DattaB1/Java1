import java.util.Scanner;

public class FebonacciSeries {
    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count <=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int n= sc.nextInt();
        int a=0,b=1,c;
		for(int i=1;i<=10;i++) 
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}	
    }
    
}
