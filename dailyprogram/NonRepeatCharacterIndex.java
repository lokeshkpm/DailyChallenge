package dailyprogram;

public class NonRepeatCharacterIndex {

	public static void main(String[] args) {
		 String str = "leetcode";
//		 String str = "loveleetcode";
//		 String str = "aabb";
		 boolean unique = false;
	     
		 for(int i = 0; i<str.length(); i++)
	        {
	        	unique = true;
	        	char c = str.charAt(i);
	        	   for (int j = 0; j < str.length(); j++) {
	        		   if (c == str.charAt(j) && j != i) {
	        			     unique = false;	        			     
	        			     break;	        			    
	        			    }
	        	   }
	        	   if(unique) {
	   	            System.out.println("First non repeated character in string is '" + str.charAt(i)+"'"+" with index '"+i+"'");
	   	        	break;	        	
	   	        	}
	        }
	        	 	if (!unique) {
	       	        	System.out.println("First non repeated character not in string!");
	       	        }
	}	  
	}
	

