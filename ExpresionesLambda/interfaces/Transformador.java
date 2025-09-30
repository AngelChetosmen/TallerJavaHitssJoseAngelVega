package ExpresionesLambda.interfaces;

@FunctionalInterface
public interface Transformador<T, R> {
    R transformar(T dato);
}
