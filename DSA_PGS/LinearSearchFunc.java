public class LinearSearchFunc {
  private static int[] numbers;
  //creating a function and passing the paramater
  public static int linearSearch(int numbers[],int key)
  {

    for(int i=0;i<numbers.length;i++)    //loop for scanning the element
    {
      if(numbers[i]==key)   // finding the key using num[i]array
      return i;              // if find then return 
    }
    return -1; //or return from the loop
  }
  public static void main(String[] args) {
    int numbers[]={2,4,6,10,1,3};
    int key=10;

    int index=linearSearch(numbers, key);
      if(index==-1)
      {
        System.out.println("NOT found");
      }
      else{
        System.out.println("Key is at index"+" "+index);
      }
    
  }
}
