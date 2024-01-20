public class staticMEthod 
{
    
    static void display()
    {
        System.out.println("Welcome");
    }
    public static void main(String[] args) 
    {
        display();                                 // directly  

        staticMEthod.display();                   // By using class Name
        
        new staticMEthod().display();            // By using an Object
        
        staticMEthod st=new staticMEthod();      //By using an object refernce
        st.display();
    }
    
        
        
 }

