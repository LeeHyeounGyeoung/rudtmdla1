// 2019.12.11 ������
package f_inheri;

public class MyCar {
   KumhoTire[] frount = new KumhoTire[2];
   HankuTire[] back = new HankuTire[2];
   
	Tire[] tire = new Tire[4];
	
	public static void main(String[] args) {
		MyCar m = new MyCar();
		m.tire[0] = new KumhoTire();
		m.back[0] = new HankuTire();
		// m.frount[0] = new HankuTire(); / m.back[0] = new KumhoTire();
		// ���� �ΰ��� Ÿ���� �ٸ��� ������ ���� �Ұ�
		// tire�� HankuTire, KumhoTire�� ��ü�� �޾� ������ ���� ����.
		
        m.tire[0].run();
        
        // ��ü�� HankuTire�� ������� �ִ� ��� ��
        Tire h1 = new HankuTire();
        if(h1 instanceof KumhoTire) {
        	System.out.println("��ȣ Ÿ�̾�� �������");
        } else {
        	System.out.println("��ȣ Ÿ�̾�� ��������� ����");
        }
        
	}

}
