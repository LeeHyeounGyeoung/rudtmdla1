package c_control;

import java.util.Scanner;
  
public class Exercise07 {
    Exercise07 () {
      boolean run = true;      
      int in = 0;
      int out = 0;
      int money = 0;  
      
      Scanner scanner = new Scanner(System.in);
            
      while(run) {
    	  System.out.println("______________________________________");
    	  System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ���� ");
    	  System.out.println("______________________________________");
    	  System.out.print    	 ("���� > ");
    	     
    	  int keyCode =   scanner.nextInt();
            
           if(keyCode == 1) {
          	   System.out.println("���ݾ� > " );
          	   in =   scanner.nextInt();
          	   money = money + in;
          	 
           } else if( keyCode == 2) {
        	   System.out.println("��ݾ� > ");
        	  out =  scanner.nextInt();
        	  money = money  - out;
        	
        	  
           } else if( keyCode == 3) {
       	   System.out.println("�ܰ� > " + money);
       	
           } else if( keyCode == 4) {
        	   run = false;
        	   System.out.println("���α׷� ����");
           }  
      } // end of while         
    }
    public static void main(String[] args) {
    	new Exercise07();
}
}
