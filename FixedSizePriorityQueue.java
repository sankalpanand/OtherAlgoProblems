import java.util.*;

public class FixedSizePriorityQueue 
{
	public static void main(String[] args)
	{
		Comparator<Integer> cmp = new Comparator<Integer>() 
        {        	
        	@Override
            public int compare(Integer a, Integer b)
            {
                return Integer.compare(a, b);
            }
		};
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(cmp);
		for(int i=10; i<=100; i++)
		{
			if(queue.size() <= 5)
			{
				queue.add(i);
			}
			else
			{
				if(i > queue.peek())
				{
					queue.poll();
					queue.add(i);
				}
			}
		}
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}
	}
}
