// 강제 타입 변환 예제
// 변환으로 인한 데이터 손실이 발생되지 않도록하는 예제
package Java;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		
		if((i < Byte.MAX_VALUE )|| (i > Byte.MAX_VALUE)) { // (i<=-128) || (i>=127)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("입력 값을 다시 확인해 주세요");
		} else {
			byte b = (byte)i;
			System.out.println(b);
		}
	}
}
