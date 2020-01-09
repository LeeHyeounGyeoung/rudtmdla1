package z_exam;

public class Child extends MyClass{ // extends 를 사용하여 MyClass를 상속받음.
	
	public MyClass method1(MyClass mc) {
	// 다형성을 사용하는 이유
		MyClass m = new MyClass();
		return m;
	}	
	public Child method2(Child c) {
		Child myC = new Child();
		return myC;
	}	
	public static void main(String[] args) {
		MyClass mc = new Child();  // 다형성의 가장 기본적인 형태
		Child c = (Child)mc; // 부모클래스의 변수에 자식클래스를 생성하여 대입했을때 다시 자식클래스를 사용하기 위해서는 자식클래스로 캐스팅해야한다.		
		Child c2 = new Child(); // 위의 코드와 같은 결과가 나오지만 다형성의 형태가 아니다.
		
		c2.method1(mc); // MyClass mc = mc; -> MyClass mc = new Child(); => mc가 new Child로 만들어졌기 때문에 가능
		c2.method1(c); // MyClass mc = c; -> MyClass mc = new Child(); => 결국은 new Child로 만들어졌다.
		// method1의 매개변수 타입이 MyClass 이기 때문에 MyClass의 변수 mc와 Child의 변수 c를 사용가능	
		//c2.method2(mc); 
		
		//  Child c = mc; -> mc는 MyClass타입으로 부모 클래스이고, c는 Child타입으로 자식클래스이기 때문에 자식형의 변수에 부모클래스를 대입할 수 없다.
		c2.method2(c);		
		
		/*
		 * 만약 MyClass를 상속받은 클래스 S 가 또 있다면
		 * public S extends MyClass{}
		 *  
		 * Child 클래스에서
		 * c2.method1(new S());
		 * MyClass mc = new S();
		 * 
		 * 도 가능 
		 */
		
	}
}
