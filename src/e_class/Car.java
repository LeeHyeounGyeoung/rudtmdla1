package e_class;

public class Car {
	String model = "�׷���";
	String color = "����";
	int    maxSpeed = 0;
	
  Car() {	    }
  Car(String model) { 
	  this.model = model;  
  }       
  Car(String model, String color) {	
	  this.model = model;
	  this.color = color;
  }
  Car(String model, String color, int maxSpeed) {	
	  this.model = model;
	  this.color = color;
	  this.maxSpeed = maxSpeed;
  }
  void prn () {
	  System.out.println("model : " + this.model);
	  System.out.println("color : " + this.color);
	  System.out.println("max speed : " + this.maxSpeed);
  }
  
  public void speedUp() {
	  this.maxSpeed += 10;
  }
  public void speedDown() {
	  this.maxSpeed -= 10;
  }
  public static void main(String[] args) {
	  Car c1 = new Car();
	  Car c2 = new Car("������");
	  Car c3 = new Car("������", "�Ķ�");
	  Car c4 = new Car("������", "�Ķ�", 100);// ���� �ϳ��� ������ �ִ� �����ڰ� ���� ������ new Car(100);�� ����� �� ����.
	  													    // �Ű������� ����� ������ ������ ���� �Ű����� ������ �߿�, ������ ������� �ٲ� ���� ����. 	
	  c1.maxSpeed = 200;
	  
	  System.out.println("model : " + c1.model);
	  System.out.println("color : " + c1.color);
	  System.out.println("max speed : " + c1.maxSpeed);
	  System.out.println("---------------------------------------------");

	  System.out.println("color : " + c2.color);
	  System.out.println("max speed : " + c2.maxSpeed);
	  System.out.println("---------------------------------------------");
	  
	  System.out.println("model : " + c3.model);
	  System.out.println("color : " + c3.color);
	  System.out.println("max speed : " + c3.maxSpeed);
	  System.out.println("---------------------------------------------");
	  
	  System.out.println("c4 spac . . . . .");
	  System.out.println("model : " + c4.model);
	  System.out.println("color : " + c4.color);
	  System.out.println("max speed : " + c4.maxSpeed);
	  System.out.println("---------------------------------------------");
	  
	  c1.speedUp();
	  System.out.println("c1 max speed : " + c1.maxSpeed);
	  
  }	
}
