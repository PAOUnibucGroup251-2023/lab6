package ex1;

import java.util.Objects;

public class Employee implements Cloneable{
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

    public Employee(ex2.Employee employee){
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

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Alex", "Michaelides", 1234L, "Journalist");
        System.out.println(e1);

        Employee e2 = (Employee) e1.clone(); //if not implemented on current object, it will throw
        // CloneNotSupportedException
        //implementation just requires us to mark the class as Cloneable, which tells the compiler to add a clone()
        // method which makes a copy of the current object when called;
        System.out.println(e2);

        System.out.printf("Are the objects' contents identical? %b%n", e1.equals(e2)); //contents are identical, so
        // will print true
        System.out.printf("Are the objects identical? %b%n", e1 == e2); //the objects are different, so the result
        // will be false
    }
}
