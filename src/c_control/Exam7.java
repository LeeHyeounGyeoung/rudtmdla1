/*
 * 2019.12.04 ������
 *  3�� ���� Ǯ�� (Exercise7)
 *  switch ������ �ۼ�
 * */
package c_control;

import java.util.Scanner;

public class Exam7 {
	Exam7() {
       boolean run = true;    	 
    	 int balance = 0;
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 while(run) {
    		 System.out.println("_____________________________________");
    		 System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
    		 System.out.println("______________________________________");
    		 System.out.print("���� > ");
    		 
    		int menu = scanner.nextInt(); // read�� �ѱ��ڸ� int�� 21�� ���� ���� �� ����
    		switch(menu) {
    		case 1:     			
    			System.out.print("���ݾ� > " );
    			int v1 = scanner.nextInt();
    			balance += v1; // balance = balance + v1;
    			break;
    		case 2: 
    			System.out.print("��ݾ� > ");
                 int v2 = scanner.nextInt();
                 
                 if(v2>balance) {
                	 System.out.println("�ܾ��� �����մϴ�.");
                 } else {
                     balance -= v2; // balance = balance - v2;
                 }
    			break;
    		case 3: 
    			System.out.println("�ܾ� >" + balance);
    			break;
    		case 4: 
    			run = false;
    			break;		
    		}
  
    	 }
    	 System.out.println("���α׷� ����");
	}
     public static void main(String[] args) {
    	 new Exam7 ();
     }
}
