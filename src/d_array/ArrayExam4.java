/*
 * 2019.12.05 ������
 * 
 * */
package d_array;

import java.util.Scanner;

public class ArrayExam4 { 
	// �ʵ� �����ȿ��� �迭�� ����
	// Ŭ���� ���￡���� �� ����ٸ� ������ �ʵ念���̾ �迭 ���� ����
	// ������ �ʵ带 �߰��߰��� �����ؼ� ������� �ʴ´�.
	// �ʵ�� Ư���� ������ ���� �� �� ���� �ۼ�
	// ������ ������ Ư�� �޼ҵ� �ȿ����� ���ٸ� �޼ҵ� �ȿ�, �ٸ� �޼ҵ忡���� ���ٸ� �ʵ忡 ����
	String[] n = new String[10];
	int[][] s = new int [10][2];
	int count = 0; // �迭�� �Էµ� �ڷ��� ���� 
	
	
	// �������� ������ ���� ������ ���鼭 �޴��� ���
	ArrayExam4() {	
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		// ���ÿ� �����͸� �迭�� ����
		n[0] = "kim";
		n[1] = "hong";
		n[2] = "park";
		n[3] = "lee";
		s[0][0] = 90; s[0][1] = 80;
		s[1][0] = 70; s[1][1] = 30;
		s[2][0] = 60; s[2][1] = 20;
		s[3][0] = 50; s[3][1] = 10;
		
		count = 4;
		
		while(run) {
		   System.out.println("-------------------------------------------------");
		   System.out.println("1. �Է� | 2. ���� | 3. ��ȸ �� ��� | 4. ����");
		   System.out.println("-------------------------------------------------");
		   System.out.print("�޴� ���� : ");
		   int menu=scanner.nextInt();
	    
		  switch(menu) {                           // if������ ����� �� 
		    case 1:                                    // if(menu==1) input()
			 this.input( );                           // else if(menu==2) modify()
			 break;                                   // else if(menu==3) search()
		   case 2:
			 this.modify( );
			 break;
		   case 3:
			 this.search( );
			 break;
		   case 4:
			  run = false;
			  break;
		   
		} // switch �� ��
	  }  // while �� ��
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
   }
	// �л��� ���� ������ �迭�� �Է�
   public void input() {	   
	   Scanner scanner = new Scanner(System.in);
	   String name = "";
	   int kor = 0;
	   int eng = 0;
	   int tot = 0;
	   double avg = 0;
	   System.out.print("���� : ");
	    name = scanner.nextLine();
	   System.out.print("���� ���� : ");
	    kor = scanner.nextInt();
	   System.out.print("���� ���� : ");
	    eng = scanner.nextInt();	   
	     
	   tot = kor+eng;
	   avg = (double) tot/2;
	   
	   System.out.print(" ���� : " + tot);
	   System.out.println("��� : " + avg);
	   
	   n[count] = name;
	   s[count][0] = kor;
	   s[count][1] = eng;
	   count++;
	   
   }
   // �л��� ���� ������ ����
   // 1. ������ �л����� �Է¹޾� �˻�
   // 2. �˻��� ������ ǥ��
   // 3. ����
   // 4. �迭 ���� ����
   public void modify() {	  
	   Scanner scanner = new Scanner(System.in);
	  String findName = "";
	  System.out.print("�˻��� �л�����?");
	  findName = scanner.nextLine();
	   
	   for(int i=0 ; i<count ; i++) {
		   if(n[i].equals(findName)) {			   
			   System.out.println("���� : " + n[i]);
			   System.out.println("���� ���� : " + s[i][0]);
			   System.out.println("���� ���� : " + s[i][1]);
			   
			   System.out.println("������ �����ϼ���");
			   System.out.print("���� ���� : ");
			   s[i][0] =scanner.nextInt();
			   
			   System.out.print("�������� : ");
			   s[i][1] = scanner.nextInt();			   
		   } // end if
	   } // end for
	   
//     ���� �ۼ��� �ڵ�	   
//	   System.out.print("������ �л� ����?");
//	   String findName = scanner.nextLine();
//	   
//	   for(int i=0 ; i<count ; i++) {
//		   if(n[i].equals (findName)) {
//			 int  kor = s[i][0];
//			 int eng = s[i][1];
//			 int tot = 0;
//			 double avg =0; 		
//			 
//			 System.out.print("���� ���� : ");
//			 kor = scanner.nextInt();
//			 System.out.print("�������� : ");
//			 eng = scanner.nextInt();
//			 
//			 tot = kor+eng;
//			 avg =(double)tot/2; 	
//			 System.out.println("���� : " + tot);
//			 System.out.println("��� : " + avg);	
//			 
//			 String editName = scanner.nextLine();
//			    n[i] = editName;			
//			  System.out.print(n[i] + " ");
//			  System.out.print(s[i][0]+" ");
//			  System.out.print(s[i][1]+" ");
//			 
// 		   } 
//	   }	   
   }
   // �л��� ���� ������ ��ȸ �� ���
   public void search() {	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("�˻��� ������?");
	   String findName = scanner.nextLine();
	   
	   for(int i=0 ; i<count ; i++) {
		   if(n[ i ].equals (findName) || findName.equals("")) {
			  int tot = 0;
			  double avg =0;
	
		   System.out.print(n[i] + " ");
		   System.out.print(s[i][0] + " ");
		   System.out.print(s[i][1]  + " ");
		   //TODO(����, ����� ����Ͽ� ���)
		   tot = s[i][0] + s[i][1];
		   avg = (double) tot/2;
		   System.out.print(tot + " ");
		   System.out.printf("%5.1f",avg);		   
		   System.out.println();
	   }
	 }
   }
   public static void main(String[] args) {
	   new ArrayExam4();
   }
}
