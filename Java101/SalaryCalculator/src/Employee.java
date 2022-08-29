public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax = this.salary;
        if (salary > 1000)
            tax -= tax * 0.03;
        tax = salary - tax;
        return  tax;
    }

    public double bonus(){
        double bonus = this.salary;
        if(workHours > 40)
            bonus += (workHours - 40) * 30;
        bonus = bonus - salary;
        return bonus;
    }

    public double raiseSalary(){
        double yearSalary = this.salary;
        int yearDifference = 2021 - hireYear;

        if (yearDifference < 0)
            yearSalary = 0;

        else{
            if (yearDifference < 10)
                yearSalary += yearSalary * 0.05;
            else if (yearDifference < 20)
                yearSalary += yearSalary * 0.10;
            else
                yearSalary += yearSalary * 0.15;
            yearSalary = yearSalary - salary;
        }

        return yearSalary;
    }

    public void printInfo(){
        double salaryWithExtras = this.salary;
        double tax = tax();
        double bonus = bonus();
        double yearSalary = raiseSalary();

        if (yearSalary == 0)
            System.out.println("There is a mistake in the values!!!");

        else{
            salaryWithExtras += bonus + yearSalary - tax;
            System.out.println("Name : " + this.name);
            System.out.println("Salary : " + this.salary);
            System.out.println("Work Hours : " + this.workHours);
            System.out.println("Hire Year : " + this.hireYear);
            System.out.println("Tax : " + tax);
            System.out.println("Bonus : " + bonus);
            System.out.println("Salary Increase : " + (bonus + yearSalary - tax));
            System.out.println("Salary With Taxes And Bonus : " + (this.salary - tax + bonus));
            System.out.println("Total Salary : " + salaryWithExtras);
        }
    }
}
