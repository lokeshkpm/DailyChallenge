package dailyprogram;

public class Palindrome {

	public static void main(String[] args) {
		//Example 1:
		String s1 = "A man, a plan, a canal: Panama";
		String str1= s1.toLowerCase().replaceAll(",","").replaceAll(" ", "").replaceAll(":", "");
		
		//Example 2:
		//String s1 ="race a car";
		//String str1= s1.toLowerCase().replaceAll(" ", "");
		
		//Example 3:
		//String s1 = " ";
		//String str1= s1.replaceAll(" ", "");
		
		
		String rev ="";		
			
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		if(str1.equals(rev))
		{   
			System.out.println("Given String is a Palindrome!");
			System.out.println(true);
		}
		else
		{
			System.out.println("Given String is Not a Palindrome!");
			System.out.println(false);
		}

	}

}
