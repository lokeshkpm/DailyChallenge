package dailyprogram;

public class TwoDistinctIndices {

	public static void main(String[] args) {
		// Example 1:
//		int[] nums = {1,2,3,1}; 
//		int k = 3;
//		boolean flag = false;
		
		// Example 2:
//		int[] nums = {1,0,1,1}; 
//		int k = 1;
//		boolean flag = false;
		
		// Example 3:
		int[] nums = {1,2,3,1,2,3}; 
		int k = 2;
		boolean flag = false;
		
				for(int i = 0;i < nums.length;i++)
				{
					for(int j = i+1;j < nums.length;j++)
					{
						int value=Math.abs(i-j);
						if(nums[i]==nums[j] && value<= k)
						{
						 flag = true;						 
						}
					}
				}
				
				if (flag) {
						 System.out.println("true");
					 }
					 else {
							System.out.println("false");
						}

	}
	}