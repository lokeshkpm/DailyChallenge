package dailyprogram;

public class UniqueElementInArray {

	public static void main(String[] args) {
		//Example 1:
	    //int[] nums = {2,2,1};
	    
		//Example 2:
	    int[] nums = {4,1,2,1,2,5,6,6};
	    
	    //Example 3:
	    //int[] nums = {1};
	    
	    for (int i = 0; i < nums.length; i++)
	        {
	         boolean uniq= false;
	         for (int j = 0; j < nums.length; j++)
	            {
	                if ((nums[i] == nums[j]) && (i != j))
	                {
	                	uniq= true;
	                	break;
	                }
	            }
	                if(!uniq){
	                System.out.print(nums[i]+ " "); 
	                   }
	        }
	    }    
	}