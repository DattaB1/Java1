public class num5to1recursion 
{
  public static void main(String[] args) 
  {
    //declare the String
    String st="MyJava";

    //array opration
    char[]s=st.toCharArray();

    //STring length must be decraese
    for(int i=s.length-1;i>=0;i--)
    {
      System.out.println(s[i]);
    }
    }
  
}
