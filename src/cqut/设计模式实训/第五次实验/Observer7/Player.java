package cqut.设计模式实训.第五次实验.Observer7;


public class Player implements Observer{

	private String name;

	public Player(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public void help() {
		System.out.println("坚持住，"+this.name+"来救你！");
	}

	@Override
	public void beAttacked(Ally ally) {
		System.out.println(this.name+"被攻击！");
		ally.notifyObserver(name);
	}

}
