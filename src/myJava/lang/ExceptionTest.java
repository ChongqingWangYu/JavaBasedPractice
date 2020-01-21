package myJava.lang;

public class ExceptionTest {

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		try {
			t1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	public static void t1() throws Exception {

	}

	public static void t2() {

	}
}
