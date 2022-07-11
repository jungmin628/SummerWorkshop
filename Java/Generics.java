package week02_1;
import java.util.*;

public class week02 {
	public static void main(String args[])
	{
		List numbers = Arrays.asList(1,2,3,4,5,6);
		int sum = 0;
		for(Object number : numbers) { 
			sum += (int) number;
			System.out.println(number);
		}
		System.out.println("------------------");
		System.out.println(sum);
		System.out.println(numbers);
	}
}
