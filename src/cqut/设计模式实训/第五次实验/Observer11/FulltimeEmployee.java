package cqut.设计模式实训.第五次实验.Observer11;

public class FulltimeEmployee implements Employee {

	private String name;
	private double weeklyWage;
	private int workTime;
	
	
	
	public FulltimeEmployee(String name, double weeklyWage, int workTime) {
		this.name = name;
		this.weeklyWage = weeklyWage;
		this.workTime = workTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeeklyWage() {
		return weeklyWage;
	}

	public void setWeeklyWage(double weeklyWage) {
		this.weeklyWage = weeklyWage;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	@Override
	public void accept(Department handler) {
		handler.visit(this);
	}

}
