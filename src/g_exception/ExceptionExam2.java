// 2019.12.11 ������
// ���� ó��
// try,catch���� ���� �ʰ�, throws���� ���� ������ ��� �Ѿ ��𿡼��� try,catch���� ����Ѵ�.
// �ڹٴ� ����ó��(thread)�� �⺻�̱⶧���� �������� ��� �޶���
// throws�� �ƴ϶� throw new Exception�� �ۼ��ϸ� ������ ���� �߻�
package g_exception;

public class ExceptionExam2 {
	
	public ExceptionExam2() throws Exception {
		this.method();
	}
	
	public void method() throws Exception {
		int su = 100;
		int su2 = 10;
		System.out.println(su/su2);
		throw new Exception("������ ���ܸ� �߻� ��Ų��.");
	}

	public static void main(String[] args) {
		try {
			new ExceptionExam2();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());// �����޼����� �޾Ƽ� ��½��Ѷ�
		}
			System.out.println("��~~~~~~~~~~~~~~~~~~~");
	}

} 
