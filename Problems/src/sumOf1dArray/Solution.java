package sumOf1dArray;
/**
 * Return the running sum of arrays 
 * @author marksilvajr
 *
 */
public class Solution 
{
	public static int[] runningSum(int[] nums) 
	{
		int[] runSum = new int[nums.length];
		runSum[0] = nums[0];
		
		for(int i = 1; i < runSum.length; i++)
		{
			runSum[i] = nums[i] + runSum[i - 1];
		}
		
		return runSum;
	}
	
	public static void main(String args[])
	{
		int[] a1 = {1, 2, 3, 4};
		
		System.out.println(Solution.runningSum(a1));
	}
}
