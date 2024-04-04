package ex3;

public sealed interface Manager permits TeamManager, GeneralManager, ProgrammingManager {
    void manage();
}
