package ex3;

public sealed interface ProgrammingManager extends Manager permits ProgrammingManagerImpl { //must be either sealed
    // or non-sealed. Cannot be final. Implementers must be permitted if it is sealed
}
