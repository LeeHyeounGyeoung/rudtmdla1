package c_control;

public class ForExam1 {
 ForExam1() {
	 int sum = 0;
     for(int i=0 ; i<=100 ; i=i+2) { //1~100 , 
   // for(int i=0 ; i<=100 ; i=i+2) ¦���� ���� ���� ���ϴ� ���
   // for(int i=1 ; i<=100 ; i=i+2) Ȧ���� ���� ���� ���ϴ� ��� 
   // for(int i=1 ; i<=100 ; i++)   ��� ���� ���� ���ϴ� ��� 
    	 
    	 sum = sum+i; //sum +=i
         System.out.println(i + " ������ �� : " + sum); // ���ϴ� �������� ���ڴ�.
         
     }
         System.out.println(sum); // ���� ����� ���ڴ�.
 }
 
}
