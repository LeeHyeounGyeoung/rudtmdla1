/*
 * ������ ������ ���� ���� �׽�Ʈ
 * d_array.A.java, e_class.C.java
 * */
package d_array;

public class B {
  B(){
	  A a = new A();
	  a.f1 = 1;    // (O) public type
	  a.f2 = 1;    // (O) default type(package type)
	  a.f3 = 1;   // (X) private type
	  // �ʿ��� �͸� �ܺη� �����ִ� �� - ĸ��ȭ
  }
}
