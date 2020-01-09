package h_api;

import java.util.Arrays;
import java.util.Objects;

import h_api2.Student;
import h_api2.StudentComp;

public class SortExam {
	
	// ������ �迭���� ������������ ����
	public void numberSort() {
		int[] n = {23,235,234,254,3634,456546,54656,76787,3,4545};
		
		System.out.println("������ : ");
		System.out.println(Arrays.toString(n));
		
		int temp = 0; // ���Ǽ� ����
		
		// for�� �ΰ� (����, �� ���)
		for(int i=0; i<n.length-1; i++) { // ���� for�� // �� ���� ���� �����ϰ� �񱳸� �ؾ��ϱ� ������ n.length -1 ��ŭ ��
			for(int j =( i+1); j<n.length; j++) { // �� ��� for�� // �� ���� �� �������� �񱳸� �ؾ��ϱ� ������ j = i+1
				if(n[i]>n[j]) { // swap // ��ȣ�� �ݴ�� �ٲ��ָ� ������������ 
					temp = n[i]; // ���Ǽҿ� n[i]���� ����
					n[i] = n[j]; // ����ִ� n[i]�� n[j]�� ���� ����
					n[j] = temp;// ���ǽ��� ���Ҵ� n[i]���� ����ִ� n[j]�� ����
				}//if
			}// j
		} //i
		System.out.println("������ : ");
		System.out.println(Arrays.toString(n));
		
	}
	
	// ���ڿ��� �迭���� ������������ ����(���ڿ� �� : equals, compare to)
	public void strSort() {
		String[] n = new String[] {
				"sdfsdfs","sdghdg","werwt","ruughf","3","������","ȫ�浿","2423523","gesf342","324dsfsd"
		};
		String temp = ""; // ���ذ��� �����ؾ��� ����
		for(int i=0; i<n.length-1;i++) {
			for(int j=(i+1); j<n.length; j++) {
				if(n[i].compareTo(n[j]) > 0 ) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}// if
			}// j
		}// i
		System.out.println();
		System.out.println(Arrays.toString(n));
			// ���ڿ��� ���ʺ��� ��(�׷��� 3�� 234���� ũ�ٰ� ����)
	}
	
	public void objSort() { // ������ �����ϴ� �迭 �տ� static�� ���̸� StudentApp.n �̶�� �ϸ� ��� ���� 

		 Student[] n = new Student [] {
				
			 new Student(10,"hong",60),
			 new Student(1,"kim",90),
			 new Student(3, "park", 40),
			 new Student(8, "lee",99),
			 new Student(2,"hong",66),
			 
		};
		
//		System.out.println(Arrays.toString(n));
		
		// �й��� �Ǵ� ���������� ����(Class - StudentComp���� ���� ����)
		Student temp = null;
		for(int i = 0; i<n.length-1; i++) { // ����
			for(int j =( i+1); j<n.length; j++) { // �� ���
				int result = Objects.compare(n[i], n[j], new StudentComp());
				if(result>0) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				} // if
			} // j
		} // i
		
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]); // �Ѹ� ���
		}
	}

	public static void main(String[] args) {
		SortExam se = new SortExam();
//		se.numberSort();
//		se.strSort();
		se.objSort();
	}

}
