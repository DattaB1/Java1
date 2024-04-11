

public class Bubble_Short {
  public static void main(String[] args) 
  {
    // declare the array want to short
    int a[]={50,800,12,56,45};
    int temp;    // for swaping purpose
    
    for(int i=0;i<a.length;i++)
    {
          for(int j=0;j<a.length-1;j++)
          {
                  if(a[j]>a[j+1])
                  {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                  }
          }
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]+" ");
    }
  }
  
}
