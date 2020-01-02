// long타입 예제
package Java;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000; -> int타입의 저장범위를 넘는 큰 정수는 반드시 소문자나 대문자 'L'을 붙어야하기 때문
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
