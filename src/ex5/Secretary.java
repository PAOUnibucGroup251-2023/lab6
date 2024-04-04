package ex5;

public non-sealed class Secretary implements Employee {
    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public Long idNo() {
        return idNo;
    }

    @Override
    public String role() {
        return role;
    }

    String  firstName;
    String  lastName;
    Long idNo;
    String role;

    public Secretary(String firstName, String lastName, Long idNo, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNo = idNo;
        this.role = role;
    }

    public Secretary(Secretary employee) {
        this(employee.firstName(), employee.lastName(), employee.idNo(), employee.role());
    }

    public void showMeetings(){
        System.out.println("You have 3 meetings today");
    }
}
