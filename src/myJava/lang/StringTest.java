package myJava.lang;

import java.io.UnsupportedEncodingException;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str1 = "中文";
		byte[] bytes = str1.getBytes("UTF-8");
		String str2 = new String(bytes, "UTF-8");
		System.out.println(str2);

	}

}
