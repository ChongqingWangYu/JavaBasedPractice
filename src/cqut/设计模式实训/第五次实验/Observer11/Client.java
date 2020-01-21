package cqut.设计模式实训.第五次实验.Observer11;

public class Client {
	public static void main(String[] args) {
		EmployeeList list=new EmployeeList();
		list.addEmployye(new FulltimeEmployee("张三", 2400, 100));
		list.addEmployye(new FulltimeEmployee("李四", 2200, 90));
		list.addEmployye(new FulltimeEmployee("王五", 2600, 120));
		list.addEmployye(new ParttimeEmployee("小红", 60, 20));
		list.addEmployye(new ParttimeEmployee("小黄", 80, 18));
		list.addEmployye(new ParttimeEmployee("小黑", 65, 19));

		Department fa=new FADepartment();
		Department hr=new HRDepartment();
		System.out.println("财务部处理数据：");
		list.accept(fa);
		System.out.println("人力资源部处理数据：");
		list.accept(hr);
	}
}
