package dailyprogram;

public class MajorityElement {

	public static void main(String[] args) {
//		int [] nums = {3,2,3};
		int [] nums = {2,2,1,1,1,2,2};
		int n = nums.length;
		int count = 0;
		int maxCount = 0;		
		System.out.println("Given array elements are : ");
		for(int i = 0; i< n; i++) {
			System.out.print(nums[i]+" ");
		}
		
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j < n; j++) {
				if (nums[i] == nums[j]) {
					count ++;
				}	
			}
			if (count > (n / 2)) {
				maxCount = nums[i];
			}
			count = 0;
		}		
		
			System.out.println("\nMajority Element is : "+maxCount);			
		
		}
	}