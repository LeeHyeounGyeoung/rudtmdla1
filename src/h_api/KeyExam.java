// 2019.12.12 ������
// HashCode
package h_api;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		HashMap<Key, String>hashMap = new HashMap<Key, String>();
			
		hashMap.put(new Key(1), "������");
		hashMap.put(new Key(2), "ȫ�浿");
		
		
		hashMap.put(new Key(1), "������"); 
		
		String value = hashMap.get(new Key(1));
		
		System.out.println(value);

	}

}
