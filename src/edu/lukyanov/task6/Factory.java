package src.edu.lukyanov.task6;

public interface Factory<T> {
    default T createPart(){
        return null;
    }

   default T[] assemblyPart(){
        return null;
    }
}
