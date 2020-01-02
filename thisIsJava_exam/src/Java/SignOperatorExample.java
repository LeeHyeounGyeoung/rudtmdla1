// 부호 연산자 예제
package Java;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
//		short result3 = -s; -> short타입의 값을 연산하면 int타입의 값으로 변환되어 에러 발생
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}
}
