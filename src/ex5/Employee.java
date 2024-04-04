package ex5;

public sealed interface Employee permits GeneralManager, ProgrammingManagerImpl, Secretary {

    public String firstName();

    public String lastName();

    public Long idNo();

    public String role();
}
