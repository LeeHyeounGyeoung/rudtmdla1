/*
 * 2019.12.02 ������
 * ���� 5)
 * 1~1000������ �հ谡 5000�� �Ѵ� ������ ���� ����Ͻÿ�
 * */
package c_control;

public class ForExam5 {
   ForExam5 (){
	   
	   int sum = 0;
	   int i = 0;
	   
	   for ( i = 1 ; i<= 1000; i++) {
	      sum = sum+i;   
		//  sum += i ; 		   
		   if (sum>=5000) { 
			  System.out.println(i + ", " + sum);
			  System.out.println(i);
			  break; 
		   }
	  // System.out.println((i-1) + "," + sum);
	   }	 
   }
}
