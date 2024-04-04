package ex2;

import java.util.Objects;

public sealed class Employee implements Cloneable permits GeneralManager, Secretary {
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

    public Employee(Employee employee){
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
