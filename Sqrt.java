
public class Sqrt {



/*
	This method works for Perfect Squares-
	Subtract n from consecutive odd numbers like 1,3,5 ...... until n is greater than equal to 0. 
	The number of subtraction operation is square root of n.
	for example let say n=16.
	then, 16-1=15,
	15-3=12,
	12-5=7,
	7-7=0,
	so there we have done subtraction 4 times. Hence square root of 16 is 4.

*/
	public static void main(String[] args) 
	{
		System.out.println(squareRoot(90));
		
		
	}

	public static float squareRoot(float num)
	{
		float guess = num;
		float original = num;
		float y = 1;

		// Set the precision
		float precision = 0.000001f;

		// with each iteration, guess will go down from num and y will go up from 1.
		// And they continue doing so until the precision is met 
		// If I do not update y, the while loop will not exit
		while(guess - y > precision)
		{
			guess = (guess + original / guess)/2;
			y = original / guess;
		}

		return guess;
	}
	
	
}
