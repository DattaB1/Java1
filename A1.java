public class A1 
{
    void show()
    {
        System.out.println("A class");
    }
}
class B1 extends A1
{
    void show()
    {
        System.out.println("B class");
    }
    void print()
    {
        show();
        this.show();
        super.show();
    }
    public static void main(String[] args) {
        B1 ob=new B1();
        ob.print();
    }
}
