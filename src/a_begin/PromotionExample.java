// 1
package a_begin;

public class PromotionExample {
	int a=80;//class�ȿ��� �ʵ�μ� ����Ȱ�
	int b=90;
	int c=50;
//������̱� ������ ������ �ȵ�-> ��������ʵ带 �����ϴ� ��Ұ� �ƴϱ� ����
//�׼��� �������� ��Ҵ� �޼ҵ� �ȿ����� ����
   
   //�����ڷ� �ҷ����� �޼���(�ݵ�� Ŭ���� ��� �����ؾ���, �ݵ�� ()�� �پ���ϰ�, {}�� �ݵ�� �־�� ��)
   PromotionExample(){  
	   c=a+b;
	   System.out.println(c);
	   
	   byte byteValue = 10;
	   int intValue = byteValue;
	   
	   System.out.println(intValue);
	   
	   char charValue = '��';
	   intValue = charValue;
	   System.out.println("���� �����ڵ�=" + intValue);
	   
	   intValue = 500;
	   long longValue = intValue;
	   System.out.println(longValue);
	   
	   intValue = 200;
	   double doubleValue = intValue;
	   System.out.println(doubleValue);
	   
	   
	   
	   
	   
   }
   
   public static void main(String[] args) {
    	 new PromotionExample();
    	 
     }
}

