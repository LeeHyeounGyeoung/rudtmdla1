package c_control;

public class SwitchExample {
	
	 public SwitchExample (){
		 
		 String a ="";
		 int num = 0;
		 
		 for(int i=0; i<500; i=i+2) {
			  num = (int)(Math.random()*6)+1;
		 
		 if(num<1 || num>6) {
		   System.out.println("��ȣ�� ���� �߻�");
		   System.exit(0);	
		 }		 
		 switch(num) {
	 	 case 1:
			a = "1���� ���Խ��ϴ�.";
		     break;
	 	 case 2:
	 		a = "2���� ���Խ��ϴ�.";
	 		break;
	 	 case 3:
	 		a = "3���� ���Խ��ϴ�.";
	 	 case 4:
	 		a = "4���� ���Խ��ϴ�.";
	 		 break;
	 	 case 5:
	 		a = "5���� ���Խ��ϴ�.";
	 	     break;
	 	 case 6:
	 		a = "6���� ���Խ��ϴ�.";
		 } // switch�� ��
	 
		 System.out.println(a);
		 } // for�� ��
	 } 
	   public static void main(String[] args) {
		   new SwitchExample ();
		   
	   }
	}


