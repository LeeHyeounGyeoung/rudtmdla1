package Java;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1-10;
			int v3 = v1 + v2 + 5; // v2를 if문안에서 선언하였기 때문에 v3도 if안에서 선언
			System.out.println(v3);
		}
	}
}
