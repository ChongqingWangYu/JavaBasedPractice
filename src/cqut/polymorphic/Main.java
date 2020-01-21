package cqut.polymorphic;
public class Main {

    public static void main(String[] args) {
//        String.valueOf(1);
//        String.valueOf(1.5);
//        String.valueOf(true);
//        String.valueOf(new Object());
//        Boss boss = new Boss("老大", 10000);
//        Manager manager = new Manager("王渔", 2000);
//        Employee[] staff = new Employee[3];
//
//        staff[0] = manager;
////        manager=staff[0];
//        manager.setBonus(5000);
////        staff[0].setBonus(5000);
//        staff[1] = new Employee("李超", 1500);
//        staff[2] = boss;
//        boss.setBonus(50000);
//        boss.expel(staff[0]);
//        for (Employee e : staff) {
//            System.out.println(e.getSalary());
//            System.out.println(e.toString());
//        }
        Employee e = new Employee("张三", 2000);
        System.out.println(e.toString() + e.getName() + e.getSalary());//cqut.polymorphic.Employee@1b6d3586张三2000.0
        e = changeSalary(e);
        System.out.println(e.toString() + e.getName() + e.getSalary());//cqut.polymorphic.Employee@4554617c李四1500.0
    }
        private static Employee changeSalary(Employee e){
            e=new Employee("李四",1500);
            System.out.println(e.toString()+e.getName()+e.getSalary());//cqut.polymorphic.Employee@4554617c李四1500.0
            return e;
        }
}
