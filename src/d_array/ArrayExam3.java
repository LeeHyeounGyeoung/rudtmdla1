package d_array;

  import java.util.Scanner;

public class ArrayExam3 {
	
	//�޼��� �⺻ ���� : ������ ��ȯ�� �޼����(�Ű�����){...}
	// �����ڴ� ���� ����
	// �����ڰ� �ƴ� �޼ҵ�� ������ ȣ�� ���ؾ� �Ѵ�.
	// ���� class�ȿ����� this,test1�� ȣ�� (���� ����� ���̿��� ȣ�� �� ���� �̸��� �Ҹ��� ȣ�� ����
	// �޼��� �ȿ����� �޼��� ���� �Ұ�
	//class �ۿ����� �޼��� ���� �Ұ�. ���� �����Ѵٸ� �ݵ�� ��ü�� ���� �����ϰ� ȣ���ؾ� �Ѵ�.
	
	// ������ 2���� �迭�� �����ϰ�, �ʱⰪ�� 4�� 3���� �����͸� ����
	public void test1() {
     int[ ][ ] s = new int[ ][ ] {
    	 { 1, 2, 2 },
    	 { 4, 2, 4 },
    	 { 4, 5, 4 },
    	 { 7, 8, 2 }
     }; // �̷����°� 4�� 3��
     
     // �迭�� ���
     System.out.println("��� : " + s.length);
     //ù��°���� ���� 
     System.out.println("ù��°���� �� �� : " + s[0].length);
     //�ι�°���� 3��°���� ����?
     System.out.println("�ι�°���� ����°���� �� : " + s[1][2]);
     // ù��°���� ������ �հ�
     int hap = s[0][0] + s[0][1] + s[0][2];
     System.out.println("ù��°���� �հ� : " + hap);
     // ù��°���� �հ�
      hap = s[0][0] +s[1][0] + s[2][0] + s[3][0];
     System.out.println("ù��°���� �հ� : " + hap);
     // �ι�°���� ������ ¦���� ���
     if(s[1][0]%2==0) { System.out.print( s[1][0] ) ; } 
     if(s[1][1]%2==0) { System.out.print( s[1][1] ) ; }  
     if(s[1][2]%2==0) { System.out.print( s[1][2] ) ; }
     System.out.println(" ");
     System.out.println("_________________________________________ ");
     //����°���� ¦���� ����� ��� 
        hap = 0;
        int count = 0;
        double avg = 0;
        
     for( int i=0; i<s.length; i++) {
    	 if(s[i][2]%2==0) {    
    		 hap= hap+s[i][2];
    		 count++;
    	     }
    	 } if(count>0) {
        avg= (double)hap/count;
        System.out.println("�հ� : " + hap);
        System.out.println("¦���� ���� : " + count);
        System.out.println("��� : " + avg);
        }    	 
    	 System.out.println("________________________________________ ");
     }
	public int test2() {
		// ���ڿ� 1�����迭(names)�� ������ ���� 5���� ����
		// ������ 2�����迭(s)�� 5���� ����, ���� ������ ����
		String[ ] names = {"a","b","c","d","e" };
		 int[ ][ ] s =  {
				 {10,20},
				 {20,30},
				 {30,40},
				 {50,60},
				 {60,70}
		 };
		 int tot = 0;
		 double avg = 0;
		 // �迭�� ù��° �л��� �̸��� ������ ����, ����� ����Ͻÿ�.
		 tot = s[0][0]+s[0][1];
		 avg = (double) tot/s[0].length;
		 
		 System.out.println("�̸� : " + names[0]);
		 System.out.println("���� ���� : " + s[0][0]);
		 System.out.println("����� : " + s[0][1]);
		 System.out.println("���� : " + tot);
		 System.out.println("��� : " + avg);
		 System.out.println("____________________________________________");
		 
		 // ����° �л��� ���������� 100������ ����
		 s[2][0] = 100;
		 // ����° �л��� �̸��� ������� ���
		 System.out.println("�̸� : " + names[2]);
		 System.out.println("���� ���� : " + s[2][0]);
		 System.out.println("____________________________________________");
		
		 // �л����� "d"�� ����� ����, ������� ������ ����� ����Ͽ� ���
		 // ����ϵ� ������ "�ڷ����"�� ���
		 // �˻�� �Է��Ͽ� �˻��Ͽ� �˻��� �����Ϸ��� "quit"��
		 //�Է��ϵ��� ���α׷��� �����Ͻÿ�
		 
		 
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 String findStr = " ";		 
		 
		 while ( !findStr.equals ("quit"))	 {
				 System.out.println ("�˻��� �̸���?");
				 findStr = scanner.nextLine (); // findStr�� ��ȯ���� StringŸ���̱� ������ ���
		 		
		 int p = -1;		 
	    for(int i=0; i<names.length; i++) {
			 if(names[i].equals(findStr)) { 
				 p =  i;
				 tot = s[i][0] + s[i][1];
				 avg = (double)tot /s[i].length; // avg = tot / 2.0;
				 System.out.println("---------�˻����---------------");
				 System.out.println("�̸� : " + names[i]);
				 System.out.println("���� ���� : " + s[i][0]);
				 System.out.println("���� ���� : " + s[i][1]);
				 System.out.println("���� : " + tot );
				 System.out.println("��� : " + avg);
				 break; // ���� ���������� �ִٸ� break ���� 
			    } 	    		  			 
	    	 }
		    if (p==-1) { // (p<0) 
			    System.out.println("�ڷ� ����");	}
          }
		   return 0;
	  }
	public static void main(String[] args) {
       ArrayExam3 a3 = new ArrayExam3();
       // �����ڸ� �����ϰ� ����ϸ� ����ӽ��� �����ڸ� �����ͼ� ���
       // ���� �ӽ��� �����ڸ� ������ �´ٸ� �Ű������� ����ִ�.
     //  a3.test1(); 
       a3.test2();
  }  
}
