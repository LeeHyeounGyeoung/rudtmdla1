package e_class;

public class Car2 {
   int gas;
   
   public void setGas(int gas) { // setGas �� ����. ���ʹ� set���� ���� , �ݵ�� �Ű������� �ϳ��� �־�� �Ѵ�.
	   this.gas = gas;
   }
   public boolean isLeftGas() {
	   if(gas==0) {
		   System.out.println("gas�� �����ϴ�.");
		   return false;
	   } else {
	       System.out.println("gas�� �ֽ��ϴ�.");
	       return true;
	  }
   }
   public void run() {
	   while(true) {
		   if(gas>0) {
			   System.out.println("�޸��ϴ�. (gas �ܷ� : " + gas + ")");
			   gas -= 1;
		   } else {
			   System.out.println("����ϴ�. (gas �ܷ� :" + gas + ")");
			   return;
		   }
	   }
   }
}
