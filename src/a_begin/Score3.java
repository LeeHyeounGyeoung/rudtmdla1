package a_begin;

public class Score3 {
  Score3 (){
 int kor = 95;
 int eng = 80;
 int total = kor+eng;
 double pg = (double) total/2; // pg = total/2.0;
 
 System.out.println("------------------");
 System.out.println("���� ó�� ���");
 System.out.println("------------------");
 System.out.println("�ۼ����� : 2019.11.27(��)");
 System.out.println("�ۼ��� : ������");
 System.out.println("���� : " + kor);
 System.out.println("���� : " + eng);
 System.out.println("�հ� : " + total);
 System.out.println("��� : " + pg);
 System.out.println("--------------------");
  }
  
public static void main(String[]  args) {
      new Score3();
}
}