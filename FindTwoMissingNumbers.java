
public class FindTwoMissingNumbers 
{
	public static void main(String[] args) 
	{
		int nums[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,41,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
				61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,
				91,92,94,95,96,97,98,99,100};
		
		find(nums);
	}
	
	public static void find(int[] nums)
	{
		int sum1=0, sum2=0, sumSq1=0, sumSq2=0;
		for(int num : nums)
		{
			sum1 = sum1 + num;
			sumSq1 = sumSq1 + num*num;
		}
		
		for(int i=1; i<=100; i++)
		{
			sum2 = sum2 + i;
			sumSq2 = sumSq2 + i*i;
		}
		
		int aPlusB = sum2 - sum1;
		int aSqPlusBSq = sumSq2 - sumSq1;
		int ab = ((aPlusB * aPlusB) - aSqPlusBSq)/2;
		
		int d = (int) Math.sqrt(aPlusB*aPlusB - 4 * ab);
		
		int x1 = (aPlusB+d)/2;
		int x2 = (aPlusB-d)/2;
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
