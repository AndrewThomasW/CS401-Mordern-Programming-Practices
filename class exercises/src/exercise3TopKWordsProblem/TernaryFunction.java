package exercise3TopKWordsProblem;

@FunctionalInterface
public interface TernaryFunction<S,T,U,R> {
	//abstract method
	R apply(S s,T t,U u);
}
