public class RefernceDataTypemethods 
{
    /* int addElements(int[] a)
    {
        int total=0;
        for(int b:a){
            total=total+b;
        }
        return total;
    }
    public static void main(String[] args) {
        //calling above method with object reference
        int []a={23,54,45,85,10};
        RefernceDataTypemethods rd=new RefernceDataTypemethods();
        int x=rd.addElements(a);
        System.out.println(x);
    }*/

     /* 
//Methods without argument with return value
    int[] get()
    {
        int[]a={10,20,25,40,50};
        return a;
    }
    public static void main(String[] args) 
    {
        int []x=new RefernceDataTypemethods().get();
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        RefernceDataTypemethods rm=new RefernceDataTypemethods();
        int[] y=rm.get();
        for(int z:y)
        {
            System.out.println(z);
        }

    }*/

    //method without argument and without return type
        void show(){
            System.out.println("welcome");
        }
        public static void main(String[] args) {
            new RefernceDataTypemethods().show();
            RefernceDataTypemethods rm=new RefernceDataTypemethods();
            rm.show();
        }

}
