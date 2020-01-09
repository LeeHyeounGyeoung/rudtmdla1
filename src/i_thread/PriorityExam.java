package i_thread;

public class PriorityExam {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread t = new CalcThread("thread" + i);			
			
			if(i!=10) {
				t.setPriority(Thread.MIN_PRIORITY);  // t.setPriority(1);  �̷��� ����ص� (���� ���� ���� �־) ����
			} else {
				t.setPriority(Thread.MAX_PRIORITY); // t,setPriority(10); �̷��� ����ص� (���� ū ���� �־) ����
			}
			
			t.start();
		}
	}
}
