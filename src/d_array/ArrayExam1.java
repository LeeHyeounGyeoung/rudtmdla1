package d_array;

public class ArrayExam1 {
   ArrayExam1() {
	   //�迭�� �����ϸ鼭 �ʱⰪ�� ����
	   int[] scores = {11,12,13,14,15,};
	   System.out.println(scores[4]); // ó�� ������ 0�̱� ������ ���� �ϳ��� ���� ����
	   
	   // ���ڿ��� �迭�� �����ϰ� ������ ������ 3�� ����
	   String[] names = {"ȫ","��","��"};
	   System.out.println(names[0]);
	   System.out.println(names[1]);
	   System.out.println(names[2]);
	   System.out.println("-----------------------------------");
	   
	   names[0] = "hong";
	   names[1] = "kim";
	   names[2] = "lee";
	   System.out.println(names[0]);
	   System.out.println(names[1]);
	   System.out.println(names[2]);
	   System.out.println("-----------------------------------");
	   
	   // �迭�� ������ �Ŀ� �ʱⰪ�� �����Ҷ� 	   
	  // double[] height = new double[ ]{150.5, 160, 165.5 };
		double[] height = null;	 
	   height = new double[ ]{150.5, 160, 165.5 };
        System.out.println(height[0]);
        System.out.println(height[1]);
        System.out.println(height[2]);
        System.out.println("-----------------------------------");
        
        //10���� �����Ը� ������ �� �ִ� �Ǽ��� �迭�� ����
        double[] w = new double[10];
        
        //�����Լ��� ����Ͽ� �����Ը� �߻����� �迭w�� ����
        for(int i = 0; i<10; i++) {
        	double d = Math.random()*100;
        	w[i] = d;
        }
        for(int i=0; i<10; i++) {
        	System.out.printf ("%5.1f \n", w[i]);
           
        } 
        System.out.println("-----------------------------------");
        //�������� �հ�� ��� ���
        double hap = 0;
        for(int i = 0; i<w.length ; i++) {
        	hap += w[i];
        }
        double avg = hap/w.length;
        
        System.out.printf("�հ� = %8.2f \n", hap);
        System.out.printf("��� = %7.2f \n", avg);
        System.out.println("-----------------------------------");
       }
	   
   public static void main(String[] args) {
	   new ArrayExam1();
   }
}
