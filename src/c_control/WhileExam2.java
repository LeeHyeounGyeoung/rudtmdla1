package c_control;

public class WhileExam2 {
    WhileExam2() {
    	int sum = 0;
    	int i = 1;
    	
    	while (i<=100) {
    		sum = sum+i;    // sum += i;
    			i++;
    	}
    	System.out.println("1~" + (i-1) +" ��: " + sum );
    	System.out.println("-------------------------");
    	
    	int s = 0;
    	int a = 0;
    	
    	while (a<100) {
    		a++;
    		s = s+a;   		
    	}
    	System.out.println("1~" + a +" ��: " + s );
    }
}
// ��� ������ while�� '{ }' �ȿ� ������ ���� ���� ���
// ��� ������ while�� '{ }' �ۿ� ������ ����� ���