/*
 * 2019.11.29 ������
 * �ζ� ���� ���α׷�
 * */
package c_control;

public class Lotto {
	int n[] = new int[6]; // ���� �Ϲ��������� ,new�� ��������� ���� ������
	int count = 0;
	
	void process() {
		boolean b = false; //�ߺ����� �ʾҴ�.
		this.n[count] = (int)(Math.random()*45)+1;
     	
		for(int i=0 ; i<count ; i++) {
		   if( n[i] == n[count]) {
			   b = true;
		   }
		}
		
		if(!b) {
     		count++;
     		prn();
      }
	}
	
	void prn() {
		System.out.println(n[count-1]);
	}
	  public static void main(String[] args) { // static���� ����� ������ �ڵ����� static ���̴�.
		Lotto k = new Lotto();
		int a = 6;
		//a�� for�� �ȿ��� �����߱� ������ for�� �ȿ����� ��� ����
		for( ;k.count<a; ) {
		k.process(); 
	   }
	 }
   }


