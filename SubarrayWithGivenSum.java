
public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {15, 2, 4, 8, 9, 5, 10, 23};
		int n = 23;
		findSubArray(nums,n);
	}
	
	// http://www.geeksforgeeks.org/find-subarray-with-given-sum/
	public static void findSubArray(int[] nums, int sum)
	{
		int currSum = 0;
		int start=0;
		int end=0;
		
		for(int i=0; i<nums.length; i++)
		{
			while(currSum < sum && end < nums.length)
			{
				currSum = currSum + nums[end++];
			}
			
			if(currSum == sum)
			{
				System.out.println("Found between " + nums[start] + " and " + nums[end-1]);
				break;
			}
				
				
			while(currSum > sum && start < nums.length)
			{
				currSum = currSum - nums[start++];
			}
		}
	}

}
