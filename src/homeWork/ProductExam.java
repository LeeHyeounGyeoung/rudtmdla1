// 2019.12.11
package homeWork;

public class ProductExam {

	public static void main(String[] args) {
		
		Product pro = new Product();
		Radio radio = new Radio();
		Video video = new Video();
		TV tv = new TV();
		
		radio.getProductName();
		video.getProductName();
		tv.getProductName();
		
		// Video �� Radio �� ��ȯ		
//			Video vi1 = new Video();
//	        Radio r1 = (Radio) vi1;			// ���� �߻�
		
		// Product�� ��ȯ  
		try {
	   Product r = (Product)radio;
	   Product v = (Product)video;
	   Product t = (Product)tv;
		}catch(ClassCastException ex) {
			System.out.println("����ȯ ����");
		}finally {
			System.out.println("����ȯ ����");
		}	   
	}		
}