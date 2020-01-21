package cqut.polymorphic;

public class Manager extends Employee {
    private  double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public double getSalary(){
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }

    public void  setBonus(double b){
        bonus=b;
    }
    @Override
    public String toString() {
        return super.toString()+"[bonus="+bonus+"]";
    }
}
