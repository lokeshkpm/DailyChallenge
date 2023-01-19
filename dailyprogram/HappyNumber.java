package dailyprogram;

public class HappyNumber {

	public static void main(String[] args) {
		int num = 19;
//		int num = 2;
		int rem = 1, sum = 0;
        
        while (num > 9)
        {
            while (num > 0)
            {
                rem = num % 10;
                sum = sum + (rem * rem);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("It is a Happy Number!");
        }
        else
        {
            System.out.println("It is not a Happy Number!");
        }
    }

	}


