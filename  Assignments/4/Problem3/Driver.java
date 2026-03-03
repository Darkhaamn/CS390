package Problem3;

import java.util.ArrayList;

public class Driver {
    void main() {
        CommisionEmployee e1 = new CommisionEmployee("John", "Alice", "#1", 100, 20);
        HourlyEmployee e2 = new HourlyEmployee("John1", "Alice1", "#2", 1000, 2);
        SalariedEmployee e3 = new SalariedEmployee("John", "Alice", "#3", 500);
        SalariedEmployee e4 = new SalariedEmployee("Darkhanbayar", "Erdenebat", "#4", 200);
        BasePlusCommisionEmployee e5 = new BasePlusCommisionEmployee("John", "Alice", "#5", 100, 20, 500);

        Employee[] cols = {e1, e2, e3, e4, e5};
        for (Employee emp : cols) {
            System.out.println(emp);
            System.out.println("------------------");
        }

        Employee[] result = findSalaryList(cols, 300);
        System.out.println("Employees with salary less than 300:");
        for (Employee e : result) {
            System.out.println(e);
        }
    }

    public static Employee[] findSalaryList(Employee[] col, double salary) {

        if (col == null || col.length == 0) {
            return new Employee[0];
        }

        ArrayList<Employee> list = new ArrayList<>();

        for (Employee emp : col) {
            if (emp.getPayment() < salary) {
                list.add(emp);
            }
        }

        return list.toArray(new Employee[0]);
    }
}
