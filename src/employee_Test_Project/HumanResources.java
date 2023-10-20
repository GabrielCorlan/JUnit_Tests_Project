package employee_Test_Project;

public class HumanResources {

    public double calculateYearlySalary(Employee employee){
        return employee.getMonthlySalary() * 12;
    }

    public double calculateAppraisal(Employee employee){
        return employee.getMonthlySalary() < 10000 ? 500 : 1000;
    }
}
