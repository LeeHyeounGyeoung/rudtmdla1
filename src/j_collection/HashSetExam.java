
// HashSet�� �ߺ������� �ȵ�����, ��ҹ��ڴ� �����Ͽ� Java�� �ΰ����� �Ͽ����� ����� �ϳ��� �Ǿ���,�빮�ڿ���  JAVA�� ���
// ���� �ۼ��� ���� 6�� ������, ��¹������� ��ü ���� 5���� ���(Java�� �ΰ� �ۼ��Ǿ��ֱ� ������)
// ���� �ۼ��� ������ ��µ��� �ʰ�, ���� ������� ��µ��� �ʴ´�. (������ ����.)
// �ݵ�� �����긦 �Ѵ��� �ڷḦ �߰� �����ؾ� �Ѵ�. (���������Ͱ� ���� ������)

package j_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("selvlet/JSP");
		set.add("java");
		set.add("JAVA");
		set.add("myBatis");
		
		System.out.println("size : " + set.size());
		
		// iterator�޼ҵ� ��� (��ü �˻�)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		System.out.println("--------------------------------------------");
		
		// ���� for�� ���
		for(String temp : set) {
			System.out.println(temp);
		}
		set.remove("java");
		set.remove("myBatis");
		
		System.out.println("--------------------------------------------");
		System.out.println("���� �� size : " + set.size());
		iter = set.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		System.out.println("--------------------------------------------");
		set.clear();
		if(set.isEmpty()) System.out.println("�ڷᰡ ����ֽ��ϴ�.");
		
		//-------------------------------------------------------------
		Set<MemberVo> memberSet = new HashSet<MemberVo>();
		memberSet.add(new MemberVo("a001", "1111", "hong", "010-1234")); // ����
		memberSet.add(new MemberVo("a002", "1111", "hong", "010-1234")); // ���̵� �ٸ� , ��� ����
		memberSet.add(new MemberVo("a002", "1111", "hong", "010-0000")); // ����ó �ٸ� , ��°���
		
		memberSet.add(new MemberVo("a002", "2222", "kim", "010-1234")); // �̸��� �ٸ��� ���̵�, ����ó ���� , ��� �ȵ�
		
		// MemberVo Ŭ������ Hash�����ڿ� equals �����ڿ��� ���̵�� ����ó�� ������ ���� ��ü��� ���ǵǾ��ִ�.
		// ���̵�� ����ó�� ����, �ٸ� �׸���� ��� �޶� ���� ��ü���� �����Ͽ� ������ �ȵ�
		
		System.out.println("memberSet size : " + memberSet.size());
		
		Iterator<MemberVo> iter2 = memberSet.iterator();
		while(iter2.hasNext()) {
			MemberVo vo = iter2.next();
			System.out.print(vo);
		}
		// ������ ���� 
		// ���������Ͱ� ���� ���� �� �ٽ� �߰� �ؾ��Ѵ�.
		MemberVo delvo = new MemberVo("a002", "1111", "hong", "010-0000");
		memberSet.remove(delvo);
		
		System.out.println("--------------------------------------------");
		//���� for��
		for( MemberVo vo : memberSet ) {
			System.out.print(vo);
		}
		
	}
}