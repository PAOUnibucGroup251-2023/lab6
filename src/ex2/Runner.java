package ex2;

public class Runner {
    public static void main(String[] args) {
        Employee e = new Employee("Michael", "Kors", 1980L, "Fashionista");
        GeneralManager gm = new GeneralManager("Karl", "Lagerfeld", 1L, "Fashion manager");
        ChiefSecretary chiefSecretary = new ChiefSecretary("Giuseppe", "Gucci", 20L, "Assistant manager");
        Secretary secretary = new Secretary("Carolina", "Herrera", 30L, "Secretary");

        System.out.println(e);
        System.out.println(gm);
        System.out.println(chiefSecretary);
        System.out.println(secretary);
    }
}
