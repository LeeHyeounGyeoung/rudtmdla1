package c_control;

import  java.util.Scanner;

public class DoWhileExam {
    DoWhileExam()  {
    	System.out.println("q�� ������ ����˴ϴ�.");
    	
    	Scanner scanner = new Scanner(System.in);
    	String inputString = null;
    	
    	do {
    		System.out.print(">");
    		inputString = scanner.nextLine();
            System.out.println(inputString);
            
    	} while ( !inputString.equals("q") );
    	
    	System.out.println("���α׷� ����");
    	
    }
}
