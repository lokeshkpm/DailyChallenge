package dailyprogram;

public class JewelsStones {

	public static void main(String[] args) {
//		String jewels = "aA";
//	    String stones = "aAAbbbb";
	    
	    String jewels = "z";
	    String stones = "ZZ";
	    
		int result = 0;
		for(int i=0; i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(stones.charAt(i) == jewels.charAt(j))
                	result = result+1;
            }
        }
        System.out.println(result);
    }

	}


