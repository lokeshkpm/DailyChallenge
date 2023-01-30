package dailyprogram;

public class FirstCharacterAppearTwice {

	public static void main(String[] args) {
//		 String str = "abccbaacz";
//		 String str = "abcdd";
//		 String str = "xyzayy";			 
 		 String str = "abc";
	        boolean Found = false;
	        for(int i=0; i<str.length(); i++) {
	            for(int j=i+1; j<str.length(); j++) {
	                if(str.charAt(i)==str.charAt(j)) {	                    
	                    Found = true;
	                    break;
	                }
	            	}

	            if(Found) {
	            	System.out.println("First character Appear twice in String is: "+str.charAt(i));
	                break;
	            }	            
	        }
	           if(!Found) {
        	   System.out.println("No character Appear twice in String!");            
               }	        

			}
		}
