package week02;
import java.util.*;
/*
<개념>
상속은 기존의 클래스에 기능을 추가하거나 재정의하여 새로운 클래스를
정의하는 것을 의미한다. 
상속을 이용하면 기존에 정의되어있는 클래스의 모든 필드와 메소드를
물려받아, 새로운 클래스를 생성할 수 있다.

<장점>
기존에 작성된 클래스를 재활용할 수 있다. 자식 클래스 설계 시 중복되는
멤버를 미리 부모 클래스에 작성해 놓으면, 자식 클래스에서는 해당
멤버를 작성하지 않아도 된다. 
클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대를 마련
*/
//예제1------------------------------------------------
/*class Parent{
	private int a = 10;
	public int b = 20;
	접근지정자를 private로 지정하면 상속받은 클래스라도
	출력이 되지 않는다.
	 
}

class Child extends Parent{
	// class (자식클래스명) extends (부모클래스명)
	private int c = 30;
	void display() { // 메소드
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class inherit {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display(); // 메소드 실행
	}
}*/
//예제2------------------------------------------------
class Person{
	String name;
	String Job;
	int age;
	//아래의 메소드를 하지 않으면, 현재 클래스의 멤버변수를
	//지정할 수가 없다. 따라서 출력값은 null과 0으로 나타난다.
	Person(String name, String Job, int age){ //필드
		this.name  = name;
		this.age  = age;
		this.Job  = Job;
		// this는 현재 클래스의 멤버변수를 지정할 때 사용한다.
	}
}
class Student extends Person {
	int score;
	Student(String name, String Job, int age, int score){ //필드
		super(name,Job,age);
		this.score = score;
		//super()는 자식 클래스가 자신을 생성할 때 부모 클래스의 생성자를
		//초기화할 때 사용한다. super을 사용하지 않으면 부모 생성자에서
		//사용했던 필드 값들을 정의해주지 않았다는 뜻의 에러가 뜬다.
		//super()는 자식 클래스가 부모클래스에게 무엇을 상속받았는지 명시적으로 알려주는 역할	
	}
	void print() { //메소드
		System.out.println("이름"+name+"\n"+"직업 "+Job+"\n"+"나이 "+age+"\n"+"연봉 "+score+"\n");
	}
}
public class inherit{
	public static void main(String[] args) {
		Student st = new Student("홍길동","정보보안컨설턴트",25,98000);
		st.print();
	}
}
//---------------------------------------------------
