// ���� Ÿ�� ��ȯ ����
// ��ȯ���� ���� ������ �ս��� �߻����� �ʵ����ϴ� ����
package Java;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		
		if((i < Byte.MAX_VALUE )|| (i > Byte.MAX_VALUE)) { // (i<=-128) || (i>=127)
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("�Է� ���� �ٽ� Ȯ���� �ּ���");
		} else {
			byte b = (byte)i;
			System.out.println(b);
		}
	}
}
