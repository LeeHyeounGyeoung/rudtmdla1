// 1
package a_begin;

public class CastingExample {
	CastingExample(){
		//int -> char
		int a = 44032;
		char c = (char)a;
		System.out.println(a + " to char type : " + c);
		
		//long -> int
		long l = 500;
		int b = (int)l;
		System.out.println(b);
		
		//double -> int
		double d = 3.14;
		int e = (int)d;		
		System.out.println(d + " to int type : " + e);
		
		double d2 = 10/3; //������ ������ ���� ������ �������̿��� ����� 3.0 -> double Ÿ���̶� ��ȭ ����
		double d3 = 10/(double)3; // double Ÿ������ ������ ĳ�����Ͽ� ����� ���������� ����(3.3333333333333335)
		System.out.println(d2);
		System.out.println(d3);		
	}
	public static void main(String[] args) {
		new CastingExample();
		/*public static void main(Sting[] args) {
		 * int intValue = 44032;
		 * char charValue = (char) intValue;
		 * System.out.println(charValue);
		 * 
		 * long longValue = 500;
		 * intValue = (int) longValue;
		 * System.out.println(intValue);
		 * 
		 *double doubleValue = 3.14;
		 *intValue = (int)doubleValue;
		 *System.out.println(intValue);
		 *}
		 * */
	}
}