package b_operator;

public class Score4 {
	/*int a=90;
	 *int b=50;
	 *int c=40;
	 *int t=0;
	 *double d=0.0;
	 *boolean r;
	 *String str=null;
	 * */
 Score4(){
	 /*t = a+b+c;
	  * d = (double)t/3
	  * 
	  * r = a>=40 && b>=40 && c>=40 && d>=60;
	  * str = (r)? "�հ�" : "���հ�";
	  * 
	  * r = a<40 || b<40 || c<40; 
	  * str = (r)? "���հ�" : "�հ�";
	  * */
	 int kor = 50;
	 int eng = 50;
	 int mat = 50;
	 int total = kor+eng+mat;
	 double a = (double) total/3; // int c = total/3;
	 
	 boolean b = kor<40 && eng<40 && mat<40 && a<=60;
	 String c = (b)? "�հ�":"���հ�"; 
	 // String b = (kor<40)&&(eng<40)&&(math<40)&&(a<60)? "�հ�":"���հ�";
	 
	 System.out.println("----------------------------");
	 System.out.println("�հ� ���� ����");
	 System.out.println("----------------------------");
	 System.out.println("���� : " + kor);
	 System.out.println("���� : " + eng);
	 System.out.println("���� : " + mat);
	 System.out.println("���� : " + total);
	 System.out.println("��� : " + a);
	 System.out.println("��� : " + c);//System.out.println("��� : " + b); //System.out.println("��� : " + str);
	 System.out.println("----------------------------");
	}
 public static void main(String[] args) {
	 new Score4();
	
	/*���� ������ 
	 int a=10;
	 int b = 20;
	 int c = 0;
	 c += a; // c =c=a; �ǹ� 
	 c -= a; // c = c-a;
	 c %= 2; // c = c%2;*/
 }
}
