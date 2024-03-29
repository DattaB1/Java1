public class LinearSearch_String {
  public static void main(String[] args) {
    String arr[]={"Rahul","deepesh","vironika","amit","rohit"};   // define String array
    String item="amit";    // find this element
    int temp=0;

    //loop to find the element
    for(int i=0;i<arr.length;i++)
    {
      //String method to find method if find the 
      if(arr[i].equals(item))
      {
        System.out.println("Item is present in"+" "+i+" "+"index position");
        temp=temp+1;
      }
    }
    if(temp==0)
    {
      System.out.println("item is not present");
    }
  }
}
