package week02_1;
import java.util.*;
//제너릭
public class week02 {
	public static void main(String args[])
	{
		/* List numbers = Arrays.asList(1,2,3,4,5,6);
		//List에 타입 지정을 안했기 때문에 Object로 타입이 지정된다.
		int sum = 0;
		for(Object number : numbers) { 
			// for i in lt: 와 같은 개념임
			/* Object는 자바의 최상위 부모 클래스에 해당한다.
			따라서 자바의 모든 클래스는 Object 클래스의 자식이거나 자손 클래스가 된다.
			ex) Object는 모든 클래스가 상속한다. System, String, Number,... 
				Object 클래스는 필드가 없고 메소드로 구성되어있다. 이 메소드들은 
				모든 클래스들이 Object 클래스를 상속하므로, 모든 클래스에서 이용할 수 있다	
			  
			sum += (int) number;
			// List에 타입지정을 안해주면 더하는 부분에서 형변환을 직접해줘야함.
			System.out.println(number);
		}
		System.out.println(sum);
		System.out.println(numbers); */
		//------------------------------------------------------
		//제너릭을 이용하게 되면 불필요한 형 변환을 안해도 되고 타입 안정성이 있다.
		/*
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
			System.out.println(number);
		}
		System.out.println(numbers.getClass().getName());
		//자바에서 타입을 알기 위한 함수로는 .getClass().getName() 하면 된다.
		System.out.println(sum);		
		*/
	}
}
