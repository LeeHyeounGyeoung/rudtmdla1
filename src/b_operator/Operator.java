/*
 * �ۼ����� : 2019.11
 * �ۼ��� : ������
 * ���� �����ڿ� ���� ����
 */
package b_operator;
 
public class Operator {
	Operator(){
		//������ ������ 
		System.out.println("12%5 => " + (12%5));
		
		//������ �����ڿ� ���׿�����
		int n = 122;
		
		String r = (n%2==0)? "¦��" : "Ȧ��";//System.out.println("¦��"); : System.out.println("Ȧ��");
		System.out.println( n + "==>" + r);
		
		/*���� ������
		��ġ/��ġ*/
		int a = 10;
		int b = 10;
		a++;//(a=a+1)
		++b;//(b=b+1)
		System.out.println(a + "," + b);
		
		int c = a++;
		int d = ++b;
		System.out.println(c + "," + d);
		System.out.println(a + "," + b);
		
		//���ڿ� �� ������
		
		String name = "��";
		String irum = "��";
		
		String irum2 = new String("��");
		
		System.out.println(name==irum);  //�޼ҵ尡 ���� ������ ��°��� ture
		System.out.println(name==irum2); //�޼��尡 ���� ��������� ������ false
		
		System.out.println(name.equals(irum));
		System.out.println(name.equals(irum2));		
	}
 public static void main(String[] args) {
	 new Operator(); //new�ڿ��� �׻� �����ڸ� �ۼ�, Ŭ������ �ƴ�
 }
}















