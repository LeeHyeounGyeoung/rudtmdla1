// float, double 타입 예제
package Java;

public class FloatDouble {
public static void main(String[] args) {
	
	// 실수 값 저장
	double var1 = 3.14;
//	float var2 = 3.14 -> 실수 리터널의 기본 타입을 double로 하기 때문에 float를 사용하기 위해서는 리터널 뒤에 소문자나 대문자 'F'를 붙어야 한다. 
	float var3 = 3.14F;
	
	// 정밀도 테스트
	double var4 = 0.123456789123456789;
	float var5 = 0.1234567890123456789F;
	
	System.out.println("var1 : " + var1);
	System.out.println("var3 : " + var3);
	System.out.println("var4 : " + var4);
	System.out.println("var5 : " + var5);
	
	// e 사용하기
	int var6 = 3000000;
	// 만약 정수리터널에 10이 지수를 나타내는 'e'또는 'E'를 포함하고 있으면 정수타입 변수에 저장할 수 없고, 실수타입 변수에 저장해야한다.
	double var7 = 3e6; 
	float var8 = 3e6F;
	double var9 = 2e-3;
	
	System.out.println("var6 : " + var6);
	System.out.println("var7 : " + var7);
	System.out.println("var8 : " + var8);
	System.out.println("var9 : " + var9);
}
}
