package z_exam;

public class SubThread implements Runnable{
	public void run() { // 1~100까지의 수를 콘솔에 출력
		for(int i=0; i<=100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch(Exception ex) { }
		}
	}
}
