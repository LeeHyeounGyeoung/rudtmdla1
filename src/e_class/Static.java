package e_class;

public class Static {
	// ���� ��(�����ڿ�) - ��� ��ü�� ������(�ϳ���) ���� ����Ѵ�.
	// �ʱ�ȭ�� �ѹ��� ����
	// Ŭ������.��� �Ǵ� ��ü��.��� ���� ��� ���� ����.
   static int v1 = 5000; 
   int v2 = 5000; // �ν��Ͻ� �� (��ü�� ������ �ִ� �����̴�.)
   
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.v1 = 1000;
		s1.v2 = 1000;
		
		Static s2 = new Static();
		System.out.println(s2.v1); // v1�� static�����̱� ������ 1000���� �ѹ��� �ʱ�ȭ �Ǿ� ���� 1000
		System.out.println(Static.v1);
		System.out.println(s2.v2); // v2�� �ٽ� �ʱ�ȭ�Ǿ� ���� 5000
		

	}

}
