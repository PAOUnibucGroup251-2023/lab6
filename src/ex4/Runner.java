package ex4;

public class Runner {
    public static void main(String[] args) {
        Company.Manager gm = new Company.Manager("Karl", "Lagerfeld", 1L, "Fashion manager");
        Company.Secretary secretary = new Company.Secretary("Giuseppe", "Gucci", 20L, "Assistant manager");
        Company.Programmer programmer = new Company.Programmer("William", "Gates", 9898L, "Programming Manager");

        System.out.println(gm);
        System.out.println(secretary);
        System.out.println(programmer);
    }
}
