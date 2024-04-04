package ex2;

public non-sealed class Secretary extends Employee {
    public Secretary(String firstName, String lastName, Long idNo, String role) {
        super(firstName, lastName, idNo, role);
    }

    public Secretary(Secretary employee) {
        super(employee);
    }

    public void showMeetings(){
        System.out.println("You have 3 meetings today");
    }
}
