// 강제 타입변한 예제
// 큰 크기의 타입을 작은 데이터 타입으로 쪼개어서 저장하는 것
package Java;

public class CastingExample {
	public static void main(String[] args) {
		// char <- int
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		// int <- long
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// int <- double
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
	}
}
