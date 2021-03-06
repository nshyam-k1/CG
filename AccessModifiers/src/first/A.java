package first;

public class A {
	
	int a =10;
	protected int b =20;
	private int c = 30;
	public int d = 40;
	public static void main(String[] args) {
		A a = new A();
		System.out.println("default :"+a.a + "\tprotected :"+a.b +"\tprivate :"+ a.c+"\tpublic :" +a.d);
	}

}
