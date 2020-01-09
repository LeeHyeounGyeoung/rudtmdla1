/*
 * 2019.12.03 ���� 1)
 * 1) ������ �迭�� �����ϰ� �ʱⰪ 10�� ����(scores)
 * 2) �ִ밪, �ּҰ��� ������ ���� ����(max,min)
 * 3) max�� �迭�� ù��° ���� ����(�迭�� ù��° ���� �ִ밪���� �����ϰ� ����)
 * 4) min�� �迭�� ù��° ���� ����(�迭�� ù��° ���� �ִ밪���� �����ϰ� ����)
 * 5) �ִ밪�� ���� ���� ����
 * 6) �ּҰ��� ã�� ���� ����
 * 7) �ִ밪, �ּҰ� ���
 * */

package d_array;

public class ArrayExam2 {
   ArrayExam2() {
	   // 1)~4)
	   int[] scores = new int[]  {80,60,65,70,100,75,85,90,95,99};
	   int max = scores[0];
	   int min = scores[0];
	   
	   // 5)
	   for(int  i= 1; i <scores.length ; i++) {
		   if(scores[i] > max) {
			   max = scores[i];
		   }
	   }
	   //6)
	   for(int  i= 1; i <scores.length ; i++) {
		   if(scores[i] < min) {
			   min = scores[i];
		   }
	   }
	   
	   //7)
	   System.out.println("�ִ밪 : " + max);
	   System.out.println("�ּҰ� : " + min);
	   
   }
   public static void main(String[] args) {
	   new ArrayExam2();
   }
}
