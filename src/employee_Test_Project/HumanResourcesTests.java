package employee_Test_Project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HumanResourcesTests {

    HumanResources hr;
    Employee employee;

    @BeforeEach
    public void setUp() {
        hr = new HumanResources();
        employee = new Employee();
    }

    @Test
    public void calculateYearlySalary_WhenArgumentIs2_Return24() {
        employee.setMonthlySalary(2);
        double result = hr.calculateYearlySalary(employee);
        assertEquals(24, result, 0.0);

    }

    @Test
    public void calculateAppraisal_WhenSalaryLessThan10000_Return500() {
        employee.setMonthlySalary(9999);
        double result = hr.calculateAppraisal(employee);
        assertEquals(500, result);
    }
}
