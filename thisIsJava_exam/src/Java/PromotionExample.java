// �ڵ�Ÿ�Ժ�ȯ ����
// ����ũ�⸦ ������ Ÿ���� ū ũ�⸦ ������ Ÿ���� ����ɶ�
package Java;

public class PromotionExample {
	public static void main(String[] args) {
		// int <- byte
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		// int <- char
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ� = " + intValue);
		
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
