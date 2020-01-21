package cqut.设计模式实训.第五次实验.Observer7;

import java.util.ArrayList;

public class Ally {
	private ArrayList<Observer> list = new ArrayList<Observer>();

	public void join(Observer obs) {
		list.add(obs);
	}

	public void quit(Observer obs) {
		list.remove(obs);
	}

	public void notifyObserver(String name){
		System.out.println("紧急通知！盟友"+name+"遭受敌人攻击！");
		for (Observer obs : list) {
			if(obs.getName()!=name){
				obs.help();
			}
		}
	}
}
