package ex5;

public class ChiefSecretary extends Secretary {
    public ChiefSecretary(String firstName, String lastName, Long idNo, String role) {
        super(firstName, lastName, idNo, role);
    }

    public ChiefSecretary(ChiefSecretary employee) {
        super(employee);
    }

    public void bossSecretaryAround(){
        System.out.println("Bossing secretary around");
    }
}
