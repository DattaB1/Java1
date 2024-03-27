public class LinearSearch {
  public static void main(String[] args) 
  {
    int arr[]={5,6,8,10,1,23};
    int item=89;
    int temp=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==item)
      {
        System.out.println("item is present at"+" "+i+" "+"index position");
        temp=temp+1;
      }
    }
    if(temp==0)
    {
      System.out.println("item is not found");
    }
  }
}
