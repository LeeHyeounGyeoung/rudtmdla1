package e_class;

public class ArrayParam {
	
   ArrayParam(int[] s){	  
	   for(int i=0; i<s.length; i++) {
		   System.out.println(s[i]);
	   }
   }
   
   int arraySum(int[] s) {
	   int sum = 0;
	   for(int i=0; i<s.length; i++) {
		   sum +=s[i];
	   }
	   return sum;
   }
   // ���� ���� �迭���� �ִ밪�� ���Ͽ� ����
   // int []�ȿ��� ������ ������ ���� ������ ���ڸ� ���� ����.
  int arrayMax(int[] s ) {
	int max = s[0];
	
	for(int i = 1; i<s.length; i++) {
		if( max < s[i] ) max = s[i];
	}
	return max;
  }
  
  //���� ���� �迭���� �ּҰ��� �����Ͽ� ��ȯ
  int arrayMin(int[] s) {
	  int min = s[0];
	  
	  for(int i = 1; i<s.length; i++) {
		  if(min> s[i]) min = s[i];
	  }
	  return min;
	  // return���� �ڿ��������α׷� ���� �ȵȴ�.
	  // return ������ �ι� ������ ����.
  }
  
  int [] maxMin(int[] s) {
	  int[] m = new int [2];
	 m[0] = s[0];   // max
//  max = s[0];
	 m[1] = s[0];   // min
//  min = s[0];	  
	  for(int i = 1; i<s.length; i++) {
		  if(m[0]>s[i]) m[0] = s[i];		
	 //  if(max>s[i]) max = a[i];
		  if(m[1]<s[i]) m[1] = s[i];		  
	//   if(min<s[i]) min = s[i];
	  }	  
//    m = new int[] {max,min}
	  return m;
  }
   
	public static void main(String[] args) {
		int[] abc = {111, 2, 3, 4, 511, 6, 7, 8, 9, -10};
		ArrayParam ap1 = new ArrayParam(abc); // �����ڰ� abc(������ �迭Ÿ��)  
		int hap = ap1.arraySum(abc);
		System.out.println(hap);
		
		int m = ap1.arrayMax(abc);
		System.out.println("�ִ밪  : " + m);
		
		m = ap1.arrayMin(abc);
		System.out.println("�ּҰ� : " + m);
		
		System.out.println("----------------------------");
		int[] r = ap1.maxMin(abc);
		System.out.println("�ִ밪r[0] : " + r[0]);
		System.out.println("�ּҰ�r[1] :" + r[1]);		
	}

}
