package dailyprogram;

public class SquareRoot {

	public static int ComputeSqrt(int n) {
		 
        if(n < 2) {
            return n;
         }

         int r = 1;

        while(r*r <= n) {
             r++;
        }

        return r-1;
   }

   public static void main(String[] args) {
	   int number = 25;
       System.out.println("Square root of number'" +number+ "'is: "+ComputeSqrt(number));

   }

}
