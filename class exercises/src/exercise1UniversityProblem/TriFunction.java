/**
 * Created by hp on 10/18/2019.
 */
package exercise1UniversityProblem;


@FunctionalInterface
public interface TriFunction<S,T,U> {
    //abstract method
    U apply(S s,T t);
}
