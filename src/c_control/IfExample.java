/*
 * 2019.11.28 ������
 * ���ǹ�( if ��) ����
 * */
package c_control;

public class IfExample {
	
	public static void main(String[] args) {
	     // new IfExample(); JVM�� �Ű������� ���� �����ڸ� �Ӵ�, �͸� ��ü��� ��
		IfExample obj = new IfExample(); // Ŭ������ �̸��� ���� �ϱ� ������ ������ 
		int k = obj.type1(); // �޼��带 ȣ���ϴ� ���๮
		System.out.println(k);
		System.out.println(obj.type1());
		System.out.println("-----------------------------------");
		
		String m = obj.type2();
		System.out.println(m);
		System.out.println("-----------------------------------");
		
		System.out.println(obj.type3()); // ������ ������ �ʰ� ����ϴ� ���
		char a = obj.type3();
		System.out.println(a);
		System.out.println("-----------------------------------------------");
		
		obj.type4();
	  }
   int type1(){
       int r = 0;
	   int score = 53;
    	
    	if( score >= 90 ) {
    		System.out.println("������ 90���� Ů�ϴ�.");
    		System.out.println("����� A �Դϴ�.");}
    	
    	if( score <90 ) 
    		System.out.println("������ 90�̸��Դϴ�.");
    		     System.out.println("����� B �Դϴ�."); // �׻� ����
    	// �߰�ȣ �ȿ� ������� �ʱ� ������ �� �ٸ� if���� ���� ����, �� ���� �� ���ʹ� �׻� ���� 
    	
  	    return r;}
   
   String type2() {
	   String r = null; // null�� '���� �����Ѿ� �� �ּҰ� ����'��� �ǹ�
	   int s = 90;
	   
	   if ( s >=90 ) {
		  r = "90�̻��Դϴ�.";
		  r +="\nA";
	   } else {
		   r = "90�̸��Դϴ�.";
		   r += "\nB";
		     }
	   return r;
   }
   /*������ if~else if�� ����Ͽ� ������ ���Ͽ� r�� �����Ͻÿ�.
    * 60�̸��̸� F ����
    * */
   char type3() {
	   char r = ' '; //���� ����''��� ���� null�� ���� ������ �� >> �ݵ�� ' '��ĭ ��� ��� �� 
	    int s = 85;
	    
	    if ( s >= 90) {
	    	r = 'A';
	    	} else if ( s >= 80) {
	    		r = 'B';
	    	} else if ( s >= 70) {
	    		r += 'C';
	    	} else if ( s >= 60) {
	    	r = 'D';
	    	} else {
	    		r += 'F';
	    		}
	   return r;
   }
    // void�� ó���� ��ȯ���� ���� ��� ���, void�� �����  ��� return������ ���� �ʾƵ� ��, ��ȯ���� ���ٰ� �ؼ� void�� ������ �� ����. 
   
   /*
    * ������ 0~100�� ���� 60�̻��̸� '�հ�'
    * 60�̸��̸� '���հ�'�� ����ϰ�, ������ ���� ���̸� '��������'�� ����Ͻÿ�.
    * */
   void type4(){
       int score = 60;
       String result = "";
       
        if(score <= 100 && score >= 0) {
    	   if (score >= 60) {
    		   result = "�հ�";	   
    	 } if(score <60) { // 'else if(score <60)'��� �ᵵ ���� ����, 'else{ }' �� �ᵵ ����
    		   result = "���հ�";
         }
         } else  {
    	     result = "���� ����";
        }         
         System.out.println(result); // ������ ����Ǵ� ���� �ƴ϶� �����Լ����� ȣ���� �ؾ� ���� ����
      } 
   }
