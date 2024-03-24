class numfrom5to1
{
  public static void printNUm(int n)
  {
    if(n==0){
      return;
    }
    System.out.println(n);
    printNUm(n-1);
  }
  public static void main(String[] args) {
    int n=5;
    printNUm(5);
  }
}