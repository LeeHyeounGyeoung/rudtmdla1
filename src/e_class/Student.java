package e_class;

public class Student {
	String irum = null;
	String address ;
	String phone ;
	
	Student (){   
		this.irum = "ȫ�浿";
		this.address = "���α�";
		this.phone = "010-1111-1111";
	}
	Student (String irum){ 
		this.irum = irum;
	}			
//	Student (String irum, String address) {
//		this.irum = irum;
//		this.address = address;
//		
//	}
	Student (String irum, String address, String phone) { 
		this.irum = irum;
		this.address = address;
		this.phone = phone;	
	}
		
	void prn() {
		 System.out.println("���� : " + this.irum);
		 System.out.println("�ּ� : " + this.address);
		 System.out.println("����ó : " + this.phone);
		 System.out.println("---------------------------------------------");
	}
	
  public static void main(String[] args) {
	  Student s1 = new Student ( ); 
	  s1.prn();
	  
//	  System.out.println("���� : " + s1.irum);
//	  System.out.println("�ּ� : " + s1.address);
//	  System.out.println("����ó : " + s1.phone);
//	  System.out.println("---------------------------------------------");
	  
	  Student s2 = new Student("������");
	  s2.prn();
	  
//	  System.out.println("���� : " + s2.irum);
//	  System.out.println("�ּ� : " + s2.address);
//	  System.out.println("����ó : " + s2.phone);
//	  System.out.println("---------------------------------------------");
	  
	  Student s3 = new Student("������", "����", "010-8282-1234");
	  s3.prn();
	  
//	  System.out.println("���� : " + s3.irum);
//	  System.out.println("�ּ� : " + s3.address);
//	  System.out.println("����ó : " + s3.phone);
	  
	  
  }
}
