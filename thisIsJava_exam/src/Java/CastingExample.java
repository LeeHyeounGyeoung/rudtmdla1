// ���� Ÿ�Ժ��� ����
// ū ũ���� Ÿ���� ���� ������ Ÿ������ �ɰ�� �����ϴ� ��
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
