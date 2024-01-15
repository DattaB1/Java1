 class LinearSearchString
 {
    public static void main(String[] args)
    {
        String arr[]={"Deepak","rohit","Sonu","Ajay","vijay"};
        String item="Sonu";
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(item))
            {
                System.out.println("item is present"+i+"index postion");
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("item is not present");
        }
    }
 }