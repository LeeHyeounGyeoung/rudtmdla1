// 2019.12.11 ������
package f_inheri;

public class AirPlane {
	public  AirPlane() {
		System.out.println("�Ϲݺ����");
	}
	public AirPlane(int tire ) {
		System.out.println("Ÿ�̾" +  tire + "�����Ϲ� �����");
	}
   public void land() {
	   System.out.println("����");
   }
   public void fly() {
	   System.out.println("�Ϲ� ����");
   }
  
   public void takeOff() {
	   System.out.println("�̷��մϴ�.");
   }
}
