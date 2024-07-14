public class MethodOverloading {
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        MethodOverloading md=new MethodOverloading();
        md.add(10, 50);
        md.add(40, 7, 3);
    }
}
