package z_exam;

public class SubThread implements Runnable{
	public void run() { // 1~100������ ���� �ֿܼ� ���
		for(int i=0; i<=100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch(Exception ex) { }
		}
	}
}
