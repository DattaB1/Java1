/*import java.util.Scanner;

public class AtmConsolBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to My Bank");
        Account ac=new Account();
        System.out.println("Enter the id");
        ac.id=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the name");
        ac.name=sc.nextLine();
        System.out.println("Enter the balance");
        ac.balance=sc.nextLine();
        while(true){
            System.out.println("press 1 to check balance");
            System.out.println("press 2 to withdraw bal");
            System.out.println("press 3 to deposite amount");
            System.out.println("press 4 to exit");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Id:"+ac.Id+"name."+ac.name+"balance."+ac.balance);
            }
            if(ch==2)
            {
                System.out.println("please enter the amount to withdraw");
                if(ac.balance<0){
                    System.out.println("insufficnt");
                }else{
                    int wd=sc.nextInt();
                }

            }
            int totalbalance ac.withdraw(wd);
            System.out.println("you hava witg:"+wd+"from your account");
        }

    }
    
}*/
