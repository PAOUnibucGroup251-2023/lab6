package ex2;

public final class GeneralManager extends Employee { // subclasses of sealed classes can be final, seald, or
    // non-sealed,
    // keyword is mandatory
    public GeneralManager(String firstName, String lastName, Long idNo, String role) {
        super(firstName, lastName, idNo, role);
    }

    public GeneralManager(GeneralManager employee) {
        super(employee);
    }

    public void manage(){
        System.out.println("Management of GeneralManager");
    }
}
