package c_control;

public class SwitchExample3 {
	
   public SwitchExample3 (){
    	
	   char grade = 'B';
    	String a = "";
    	
    	switch (grade) {
    	case 'A':
    	case 'a':
    	  a = "���ȸ�� �Դϴ�.";
    	  break;
    	  
    	case 'B':
    	case 'b':
    		a = "�Ϲ�ȸ�� �Դϴ�.";
    		break;
    		
        default:
    		a = "�մ��Դϴ�.";
    	}
    	System.out.println(a);
    }
  
}
