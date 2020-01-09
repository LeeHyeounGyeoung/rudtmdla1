// 2019.12.11 ������
// ����ó�� & ������ġ

package g_exception;

import ex.NullPointlnException;

public class ExceptionExam {
 
	public static void main(String[] args) {
		// NullPointerException
		//StringŸ���� �����Ͱ� null�̱� ������ ���� 
		// ������ ��¹����� ������, ���� ������ ���๮���� ������ �� (11���� ������ �ƴ϶� 10�� ����)
		// null ��� "", ���ڸ� ������ ���� ���� ��� (String data = ""; / String data = "abc";)
		String data = null;   // String data = ""; (nullpointexception ������ �ƴ�)/
		try {	
		System.out.println(data.toString()); 
		System.out.println("������ ���� ��� �����");
		}catch(NullPointerException ex2) {
			System.out.println("Null Pointer Error !!!!!!");
			
			// �����޼����� ����ϰ� �ʹٸ� �Ʒ� �ΰ��� ��� �߿� ���
            System.out.println(ex2.toString()); // ��ȯ���� String
		    ex2.printStackTrace(); // ���� �޼����� �ֿܼ� ���(��ȯ���� void)
		    
		}catch(Exception ex) { // NullPointer���� Exception�� ������ ��� ������ ����
			System.out.println("���ڿ� ������ data ���� ����.");
		}finally {
			System.out.println("���� �߻��� ������� ������ ����");
		}
		// try,catch,finally���� ����Ͽ� ������ġ 
		// ����ó�� �Ҷ����� ���� ������ �Ʒ��� �������⶧���� ���� ���� ������ ���� ����� ������ ���� �ۼ�
		// Exception�� ��� ���ܸ� ó���ϱ� ������ ����ó�� ���� ������ ���ٸ� ���� �������� �ۼ�
		
		// ArrayIndexOutOfBoundsException(÷�ڿ���)
		int[] s = {1,2,3};
		try {
		for(int i=0; i<3; i++) { // 0 ���̽��̱� ������ ���ڰ� 3���� i<= 3�� �ƴ϶� i<3���� �ؾ� ������ ����.(�迭�� ũ�⸦ ��� ����)
			System.out.println(s[i]);
			}
		}catch(Exception ex) {
			    ex.printStackTrace();
			    
				//System.out.println("�迭�� ũ�⸦ ���");
			}
	//	System.out.println(s[3]);
		
		// NumberFormatException
		try {
		data = "123";
		int su = Integer.parseInt(data);
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("���ܰ� �߻��Ǿ ����ó���� �߻���");
		}
		try {
		data = "123a";
		int su2 = Integer.parseInt(data); 
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("���ܰ� �߻��Ǿ ����ó���� �߻���");
		}
		// �޼ҵ带 �̿��ϸ� ���ڿ��� ���ڷ� ��ȯ�� �� �ִٸ� ���ڸ� ����, ���ڰ� ��ȯ�� �� ���� ���ڰ� ���ԵǾ������� ���� �߻�
		// ���ڷ� �ٲܼ� ���� ���ڿ��� ���ڷ� �ٲܷ��� �ؼ� ���� �߻�
		
		// ClassCastException (����ȯ ����)
		try {
		Car myCar = new Car();
		SportsCar c = (SportsCar)myCar;
		}catch(Exception ex) {
			System.out.println("�� ��ȯ ������ �߻�");
		} finally {
			System.out.println("��~~~");
		}
		
		// �θ�Ŭ������ ���� �ڽ�Ŭ������ ������ ���� ��� ���� �߻� (�θ� > �ڽ�  X)
		// �ݴ�� �ڽ�Ŭ������ ���� �θ�Ŭ������ �����ϴ� ���� ���� (�ڽ� > �θ�   O)
		// ��Ӱ��谡 �ƴ� ���� ������ ���� Ŭ������ �����ϴ� �͵� �����߻�
	}
} // �ҿ����ϰ� ����ȴ�. 
// �ҿ��� ���Ḧ ������ �����ϴ°��� ����ó�� 
