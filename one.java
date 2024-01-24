public class one 
{

    //this keyword
   /*  int x=10;
    void show()
    {
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        one n=new one();
        n.show();
    }
    */



// this keyword refers currnt objcet..in below example two o/p are comes i called with first obj i.e d1 so it give me first and second is same.
    /*int x=10;
    void show()
    {   
        System.out.println(x);
    } 
    public static void main(String[] args) 
    {
        one obj=new one();
        one obj2=new one();
        obj.x=obj.x+3;
        obj.show();
        obj2.show();
    }*/


// in this example there is local and instnce varaible are present..so if we want to access instance variable.then this keyword must
  //be important.and 2nd local varaible is directly assess
  int x=10;                     //instance variable
  public void show()
  {
    int x=20;                      //local varaible
    System.out.println(x);
    System.out.println(this.x);
  }
  public static void main(String[] args) {
    one obj=new one();
    obj.show();
  }

    
}
