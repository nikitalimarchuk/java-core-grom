package lesson10.abstractblexample;

/**
 * Created by Admin on 01.06.2017.
 */
public class EmployeeController {
    private Employee[] employees = new Employee[100];

    public void paySalaryToEmployees(){
        for(Employee employee : employees){
            employee.paySalary();
            System.out.println("Salary was payed successfully to " + employee.getName() + " employee");
        }
    }
}
