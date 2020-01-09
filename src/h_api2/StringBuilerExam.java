package h_api2;

// String�� �ӵ��� StringBuilder�� �ӵ� ��
public class StringBuilerExam {
	
	public StringBuilerExam() {
		// String �ӵ�
		long sTime = 0, eTime = 0;
		String str = "";
		
		sTime = System.nanoTime();
		for(int i=0; i<50000; i++) {
			str +="a";
		}
		
		eTime = System.nanoTime();
		
		System.out.println("String ó�� �ð� : " + (eTime-sTime) );
		
		
		// StringBuilder
		StringBuilder sd = new StringBuilder(100); 
		sTime = System.nanoTime();
		for(int i=0; i<50000; i++) {
			sd.append("a");
		}
		eTime = System.nanoTime();
		
		System.out.println("StringBuiler ó�� �ð� : " + (eTime-sTime));
		
	}

	public static void main(String[] args) {
		new StringBuilerExam();

	}

}