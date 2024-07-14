public class BinarySearchInt {
    public static void main(String[] args) 
    {
        int a[]={2,5,7,12,14,16,17,19,20,24,28};
        int srch=5;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        if(a[mi]==srch)
        {
            System.out.println("element is at"+mi+"index position");
        }
        else if(a[mi]<srch)
        {
            li=mi+1;
        }
        else
        {
            hi=mi-1;
        }
        mi=(li+hi)/2;
        if(li>hi){
            System.out.println("element not found");
        }
        
    }
}