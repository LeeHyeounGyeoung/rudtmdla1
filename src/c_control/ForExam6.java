/*2019.12.02 ������
 * ���� 6)
 * 1~1000������ ���� 5�� ��� �̰ų� 7�� ������� ����Ͻÿ�.
 * */
package c_control;

public class ForExam6 {
   ForExam6 () {
	   //type 1
	   int i = 0;
	  
	   for (i=1; i<=1000; i++) {
	      if (i%5==0 || i%7==0) {
			   System.out.println(i + " ");
	      }
	   //System.out.println();
	   }
	   
	   /*type2
	   for(i=5; i<=1000; i=i+5) {
		   System.out.println(i + " ");
		    }
	   for(i=7; i<=1000; i=i+7) {
		   System.out.println(i + " ");
	  }*/
    }
   }   