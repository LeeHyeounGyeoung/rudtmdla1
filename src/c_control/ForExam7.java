/*
 * 2019.12.02 ������
 * ���� 7)
 * 1~1000������ ���� �Ҽ����� ���Ͽ� ����Ͻÿ�.
 * (�Ҽ� : 1�� �ڽ��̿��� �ڿ����� ������ �������� �ʴ� �ڿ���)
 * */
package c_control;

public class ForExam7 {
  ForExam7() {
	  for( int i=1 ; i<=1000; i++) {
		  boolean b = true;  //i�� �ҽ���.
		  for(int j=2; j<i; j++) {			  
			  if(i%j==0) {
				  b=false;
				  break;
			  }
		  }
		  if(b) {
			  System.out.println(i + " "); 
		  }
	  }		  
   }
}
