package i_thread;

public class Calc {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { // �޼ҵ� ���𿡼� 'synchronize' Ű���带 �ٿ� ����ȭ ����� ����� User1�� User2�� ���� ���������� ���� �� ���ִ�.
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2�� �� ����(�Ͻ����� ����)
		} catch (InterruptedException e) {	}
		
		System.out.println(Thread.currentThread().getName()+ " : " + this.memory);
	}	
}
