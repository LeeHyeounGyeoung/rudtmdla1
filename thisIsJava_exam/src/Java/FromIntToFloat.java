// ����Ÿ���� �Ǽ�Ÿ������ ��ȯ����
// ���� Ÿ���� �Ǽ� Ÿ������ ��ȯ�� �� ���е� �ս��� ���Ѵ�.

package Java;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
		// int���� float Ÿ������ �ڵ���ȯ�ϸ鼭 ���� �߻�(���� �սǵ�)
		System.out.println("------------------");
		num1 = 123456780;
		num2 = 123456780;
		
		double num4 = num2;
		num2 = (int)num4;
		
		int result2 = num1 - num2;
		System.out.println(result2);
		// intŸ���� �ڽ��� ũ�⺸�� ū doubleŸ������ �սǾ��� ��ȯ�� �� �ִ�.(double ���� ���� intŸ������ ��ȯ�ص� �ս� ���� �����ȴ�.)
	}
}
