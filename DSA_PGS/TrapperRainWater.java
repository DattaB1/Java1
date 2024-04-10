public class TrapperRainWater {
  public static int trappedRain(int height[])
  {
    //calculate left max boundry-array
    int n=height.length;
    int leftMax[]=new int[n];        //for helper array and is same as height of array
    leftMax[0]=height[0];
    for(int i=1;i<n;i++)
    {
      leftMax[i]=Math.max(height[i], leftMax[i-1]);
    }

    //calculate Right max boundry-array
    int rightMax[]=new int[n];
    rightMax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--)
    {
      rightMax[i]=Math.max(height[i], rightMax[i+1]);
    }

    //loop
    int trappedWater=0;
    for(int i=0;i<n;i++)
    {
        //waterlevel=min(leftmax bound,right bound)
        int waterlevel=Math.min(leftMax[i], rightMax[i]);
        //traperded water=waterlevle-height[i]
        trappedWater+=waterlevel-height[i];
        
    }
    return trappedWater;

  }

  public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    System.out.println(trappedRain(height));
  }

}
