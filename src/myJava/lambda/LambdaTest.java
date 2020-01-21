package myJava.lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class LambdaTest {

	public static void main(String[] args) {
		// 无参数无返回值
		new Thread(() -> System.out.println("Hello")).start();

		// 有参数无返回值
		ArrayList<String> list = new ArrayList<>();
		list.add("AAAAA");
		list.add("BBBBB");
		list.add("CCCCC");
		list.add("DDDDD");
		// 形参的类型是确定的，可省略；只有一个形参，()可以省略；
		list.forEach(t -> System.out.print(t + "\t"));
		// 打印结果：AAAAA BBBBB CCCCC DDDDD

		// 无参数有返回值
		Random random = new Random();
		Stream<Integer> stream = Stream.generate(() -> random.nextInt(100));
		stream.forEach(t -> System.out.println(t));
		// 只有一个return，可以省略return；该方法将会不断的打印100以内的正整数。
		// Stream.generate()方法创建无限流，该方法要求传入一个无参有返回值的方法。
	}

}
