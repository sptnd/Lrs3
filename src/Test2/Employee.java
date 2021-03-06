package Test2;

import java.time.LocalDate;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/18 23:01
 */
public class Employee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }
    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent /100;
        salary+=raise;
    }
}
