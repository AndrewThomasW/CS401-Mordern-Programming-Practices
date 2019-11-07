package exercise2AirlineProblem;

@FunctionalInterface
public interface TriFunction<S,T,R,U> {
	U apply(S s,T t,R u);
}
