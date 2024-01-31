//Just Removed the comment which statement want to excute
class InherA
{
	int x=10;    //instance variable
	void show()   //instance method
	{
		System.out.println("A class");
	}
}
class InherB extends InherA
{
	int y=20;
	void print(){
		System.out.println("B class");
	}
	public static void main(String[] args) 
	{
        //This is for A class Only it only access A class data it can cant aquare b class data
		/*
        InherA ob=new InherA();
		System.out.println(ob.x);
		ob.show();
        */

        //when we create objet of B classs it inherits the A class data also
       /* 
        InherB ob=new InherB();
        System.out.println(ob.x);
        ob.show();
        System.out.println(ob.y);
        ob.print();  
         */


        // in this it only inherits A class object other 2 are error
       /* InherA ob=new InherB();
        System.out.println(ob.x);
        ob.show();

        /*System.out.println(ob.y);
        ob.print();*/



	}
}