package z_exam;

public class Child extends MyClass{ // extends �� ����Ͽ� MyClass�� ��ӹ���.
	
	public MyClass method1(MyClass mc) {
	// �������� ����ϴ� ����
		MyClass m = new MyClass();
		return m;
	}	
	public Child method2(Child c) {
		Child myC = new Child();
		return myC;
	}	
	public static void main(String[] args) {
		MyClass mc = new Child();  // �������� ���� �⺻���� ����
		Child c = (Child)mc; // �θ�Ŭ������ ������ �ڽ�Ŭ������ �����Ͽ� ���������� �ٽ� �ڽ�Ŭ������ ����ϱ� ���ؼ��� �ڽ�Ŭ������ ĳ�����ؾ��Ѵ�.		
		Child c2 = new Child(); // ���� �ڵ�� ���� ����� �������� �������� ���°� �ƴϴ�.
		
		c2.method1(mc); // MyClass mc = mc; -> MyClass mc = new Child(); => mc�� new Child�� ��������� ������ ����
		c2.method1(c); // MyClass mc = c; -> MyClass mc = new Child(); => �ᱹ�� new Child�� ���������.
		// method1�� �Ű����� Ÿ���� MyClass �̱� ������ MyClass�� ���� mc�� Child�� ���� c�� ��밡��	
		//c2.method2(mc); 
		
		//  Child c = mc; -> mc�� MyClassŸ������ �θ� Ŭ�����̰�, c�� ChildŸ������ �ڽ�Ŭ�����̱� ������ �ڽ����� ������ �θ�Ŭ������ ������ �� ����.
		c2.method2(c);		
		
		/*
		 * ���� MyClass�� ��ӹ��� Ŭ���� S �� �� �ִٸ�
		 * public S extends MyClass{}
		 *  
		 * Child Ŭ��������
		 * c2.method1(new S());
		 * MyClass mc = new S();
		 * 
		 * �� ���� 
		 */
		
	}
}
