import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

//        List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeeList = new Vector<>();

        employeeList.add(new Employee("Jane", "jones", 1));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> {
//            System.out.println(employee);
//        });
//
//        System.out.println(employeeList.get(1));

//        employeeList.set(1, new Employee("John", "Adams", 22));
//        employeeList.forEach(employee -> {
//            System.out.println(employee);
//        });
//
//        System.out.println(employeeList.size());

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
    }
}