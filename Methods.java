public class Methods 
/*{
    int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {   // in this 10,20 goes to a,b addition store in c then it return c then value c copied into int x then x must be printed
        int x=new Methods().add(10, 20);
        System.out.println(x);
        int y=new Methods().add(10, 80);
        System.out.println(y);
    }
    
}*/
{
    int cube(int a)
    {
        int b=a*a*a;
        return b;
    }
    public static void main(String[] args) {
        int x=new Methods().cube(6);
        System.out.println(x);
        //using object refernce
        Methods m=new Methods();
        int y=m.cube(5);
        System.out.println(y);
    }
}
