/*
 * 2019.12.02 ������
 * ���� 1
 * */
package c_control;

public class Exam1 {
 Exam1 (){
	 String name = "������";
	 String address = "����� ����";
	 String phone = "010-3590-****";
	  
	 int kor = 90;
	 int eng = 90;
	 int mat = 80;
	 
	 int tot = kor + eng + mat;
	 double avg = tot/3;
	 
	 char grade;
	 
	 if(avg>=90)      { grade = 'A'; } 
	 else if(avg>=80) { grade = 'B'; } 
	 else if(avg>=70) { grade = 'c'; } 
	 else if(avg>=60) { grade = 'D'; }
	 else             { grade = 'F'; }
	 
	 String msg = "���� : " + name;
	   msg +="\n�ּ� : " + address;
	   msg +="\n����ó : " + phone;
	   msg +="\n���� : " + kor;
	   msg +="\n���� : " + eng;
	   msg +="\n���� : " + mat;
	   msg +="\n���� : " + tot;
	   msg +="\n��� : " + avg;
	   msg +="\n���� : " + grade;
	 
	 System.out.println(msg);	   	 
	 System.out.println("------------------------------------");
	 System.out.println("���� ó�� ���");
	 System.out.println("------------------------------------");
	 System.out.println("���� : " + name);
	 System.out.println("�ּ� : " + address);
	 System.out.println("����ó : "+ phone);
	 System.out.println("���� : " + kor);
	 System.out.println("���� : " + eng);
	 System.out.println("���� : " + mat);
	 System.out.println("���� : " + tot);
	 System.out.println("��� : " + avg);
	 System.out.println("���� : " + grade);
	 System.out.println("------------------------------------");
 }
  public static void main(String[] args){
	 new Exam1 ();
 }
}
