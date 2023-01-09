package dailyprogram;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = "Everyone's Favourite Colour is Black";
		System.out.println("Given string is: "+str);
        String[] strArray = str.split(" ");
        int count = strArray[strArray.length-1].length();
        System.out.println("Length of last word '"+ strArray[strArray.length-1]+ "' is: " + count);
        
	}

}
