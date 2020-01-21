package cqut.设计模式实训.第五次实验.Observer7;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ally ally=new Ally();
		ally.join(new Player("张三"));
		ally.join(new Player("李四"));
		ally.join(new Player("王五"));
		ally.notifyObserver("张三");
	}

}
