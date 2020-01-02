// 연산식에서 자동 타입 변환 예제
package Java;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; -> byte을 다시 byte타입으로 전환시킬수 없기 때문에 에러 발생
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; -> char타입을 다시 char타입으로 전환시킬 수 없기 때문에 에러 발생
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4); // 정수형 값을 출력하기 위해 소수점 이하의 수를 버림
		
		int intValue5 = 10;
//		int intValue6 = 10/4.0; -> int타입의 이터널은 double(실수형)이 나올 수 없기 때문에 에러 발생
		double  doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
	}
}
