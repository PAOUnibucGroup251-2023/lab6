package ex5;

public record GeneralManager(String firstName, String lastName, Long idNo, String role) implements Manager, Employee {
}
