package ex3;

public class Runner {
    public static void main(String[] args) {
        GeneralManager gm = new GeneralManager("Karl", "Lagerfeld", 1L, "Fashion manager");
        ChiefSecretary chiefSecretary = new ChiefSecretary("Giuseppe", "Gucci", 20L, "Assistant manager");
        Secretary secretary = new Secretary("Carolina", "Herrera", 30L, "Secretary");
        Manager programmingManager = new ProgrammingManagerImpl("William", "Gates", 9898L, "Programming Manager");

        System.out.println(gm);
        System.out.println(chiefSecretary);
        System.out.println(secretary);
        System.out.println(programmingManager);
    }
}
