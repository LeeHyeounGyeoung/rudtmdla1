// 2019.12.19 ������

package f_inheri;

public class SuperAirPlaneExam {
	public static void main(String[] args) {
		SuperAirPlane s = new SuperAirPlane();
	
		s.takeOff();
		s.fly();
		s.flyMode = SuperAirPlane.SUPERSONIC;
		s.fly();
		s.flyMode = SuperAirPlane.NORMAL;
	    s.fly();
		
	}
}
