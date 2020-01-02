// 정수타입을 실수타입으로 변환예시
// 정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다.

package Java;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
		// int값을 float 타입으로 자동변환하면서 문제 발생(값이 손실됨)
		System.out.println("------------------");
		num1 = 123456780;
		num2 = 123456780;
		
		double num4 = num2;
		num2 = (int)num4;
		
		int result2 = num1 - num2;
		System.out.println(result2);
		// int타입을 자신의 크기보다 큰 double타입으로 손실없이 변환될 수 있다.(double 값을 원래 int타입으로 변환해도 손실 없이 복원된다.)
	}
}
