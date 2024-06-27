    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class CountEmployee {
        public static void main(String[] args) throws Exception {

            Employee employee1 = new Employee(1L, "Brajesh", "IT", 23);
            Employee employee2 = new Employee(2L, "Vicky", "QA", 23);
            Employee employee3 = new Employee(3L, "Brajesh", "HR", 30);

            List<Employee> employees = Arrays.asList(employee1, employee2,employee3);
        
            System.out.println(employees);
            int count = 0;

            for (Employee emp1 : employees) {
                for (Employee emp2 : employees) {
                    if (emp1.getName().equals(emp2.getName()) && emp1.getId() != emp2.getId()) {
                        count++;

                    }
                }
            }

            System.out.println(count);
        }
    }

    class Employee {
        private Long empId;
        private String empName;
        private String department;
        private int age;

        public Employee() {

        }

        public Employee(Long empId, String empName, String department, int age) {
            this.empId = empId;
            this.empName = empName;
            this.department = department;
            this.age = age;
        }

        public String getName() {
            return this.empName;
        }

        public Long getId() {
            return this.empId;
        }
    }