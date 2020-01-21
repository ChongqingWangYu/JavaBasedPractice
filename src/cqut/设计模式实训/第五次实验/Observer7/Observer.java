package cqut.设计模式实训.第五次实验.Observer7;

public interface Observer {
	String getName();
	void setName(String name);
	void help();
	void beAttacked(Ally ally);
}
