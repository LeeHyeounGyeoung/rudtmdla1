package e_class;

public class AnnoExam {
	
	@Override
	public String toString() { // ������, �ݵ�� toString�� ��ȯ���� ����ϰ�, �Ű������� ����� �Ѵ�.
		return "������";
	}
//	public void toString(String str) {
//		// �߰� ����
//	}
	
  public static void main(String[] args) {
	  AnnoExam a = new AnnoExam();
	  
	  System.out.println(a);
  }
}
