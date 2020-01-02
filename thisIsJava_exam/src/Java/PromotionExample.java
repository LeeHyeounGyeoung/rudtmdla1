// 자동타입변환 예시
// 작은크기를 가지는 타입이 큰 크기를 가지는 타입이 저장될때
package Java;

public class PromotionExample {
	public static void main(String[] args) {
		// int <- byte
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		// int <- char
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);
		
		// long <- int
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		// double <- int
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}
}
