package i_thread;

public class ThreadNameExam {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���� ������� : " + mainThread.getName());
		
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		
		t1.start();
		t2.start();
	}
 // ���� �ɶ����� �������� ������ ���ڰ� �޶��� �� �ִ�.
 // t1�� ����Ǹ鼭 t2�� ���� ����Ǿ� ���� ��µ�
}
