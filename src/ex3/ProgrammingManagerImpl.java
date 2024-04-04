package ex3;

public final class ProgrammingManagerImpl extends Employee implements ProgrammingManager {
    public ProgrammingManagerImpl(String firstName, String lastName, Long idNo, String role) {
        super(firstName, lastName, idNo, role);
    }

    public ProgrammingManagerImpl(Employee employee) {
        super(employee);
    }

    @Override
    public void manage() {
        System.out.println("Managing some programmers");
    }
}
