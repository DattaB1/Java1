import java.util.ArrayList;
import java.util.List;

/*You are giving a String opration 
 * An integer X record new score
 * An +  record new score sum of privious two score 
 * D Record new score double of the previous score 
 * C remove the privoius score from the record
 */

 
class Baseball_easy{
  public int calPoints(List<String> ops)
	{
		List<Integer> ans=new ArrayList<>();
		for(String op:ops)
		{
			if(op.equals("C")) 
			{
				ans.remove(ans.size()-1);
			}
			else if(op.equals("D"))
			{
				int a=2*ans.get(ans.size()-1);
				ans.add(a);
			}
			else if(op.equals("+"))
			{
				int a=ans.get(ans.size()-1)+ans.get(ans.size()-2);
				ans.add(a);
			}
			else
			{
				ans.add(Integer.parseInt(op));
			}
			
		}
		int sum=0;
		for(int num:ans)
		{
			sum+= num;
		}
		return sum;
  }

  public static void main(String[] args) 
  {
    List<String> ops=new ArrayList<String>();
		ops.add("5");
		ops.add("2");
		ops.add("C");
		ops.add("D");
		ops.add("+");
		
		Baseball_easy eb=new Baseball_easy();
		int result=eb.calPoints(ops);
		
		System.out.println("Total Points:-"+result);

  }
}