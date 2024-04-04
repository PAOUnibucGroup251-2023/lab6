package ex4;

import java.util.Objects;

public class Company {
   static abstract class Employee { //we will not have access to this from outside the package. If we make it
       // private, we
        // will only have access to the public implementations from outside this class;
        private final String firstName;
        private final String lastName;
        private final Long idNo;
        private final String role;

        public Employee(String firstName, String lastName, Long idNo, String role) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNo = idNo;
            this.role = role;
        }

        public Employee(ex3.Employee employee) {
            this(employee.getFirstName(), employee.getLastName(), employee.getIdNo(), employee.getRole());
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Long getIdNo() {
            return idNo;
        }

        public String getRole() {
            return role;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(idNo, employee.idNo) && Objects.equals(role, employee.role);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, idNo, role);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", idNo=" + idNo +
                    ", role='" + role + '\'' +
                    '}';
        }
    }

    public static class Manager extends Employee {

        public Manager(String firstName, String lastName, Long idNo, String role) {
            super(firstName, lastName, idNo, role);
        }

        public Manager(ex3.Employee employee) {
            super(employee);
        }
    }

    public static class Secretary extends Employee {
        public Secretary(String firstName, String lastName, Long idNo, String role) {
            super(firstName, lastName, idNo, role);
        }

        public Secretary(ex3.Employee employee) {
            super(employee);
        }
    }

    public static class Programmer extends Employee {
        public Programmer(String firstName, String lastName, Long idNo, String role) {
            super(firstName, lastName, idNo, role);
        }

        public Programmer(ex3.Employee employee) {
            super(employee);
        }
    }
}
