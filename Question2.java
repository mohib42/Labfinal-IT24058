class Employee {

    double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {

    
    double calculateSalary() {
        double basic = 30000;
        double bonus = 5000;
        return basic + bonus;
    }
}

class PartTimeEmployee extends Employee {

    
    double calculateSalary() {
        int hoursWorked = 80;
        double ratePerHour = 300;
        return hoursWorked * ratePerHour;
    }
}


public class Question2{
    public static void main(String[] args) {

        
        Employee emp;

        emp = new FullTimeEmployee();
        System.out.println("Full Time Salary: " + emp.calculateSalary());

        emp = new PartTimeEmployee();
        System.out.println("Part Time Salary: " + emp.calculateSalary());
    }
}

