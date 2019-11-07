package exercise1UniversityProblem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;



public class Main {

	static TriFunction<University, Integer, List<Course>> getMostPopularCourse = (university, k) -> university
			.getDepartmentList().stream()
			.flatMap(d -> d.getRoleList().stream())
			.filter(r -> r instanceof Professor)
			.map(r -> (Professor) r)
			.flatMap(p -> p.getGradeList().stream())
			.map(g -> g.getCourse())
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream()
			.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
			.limit(k)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
}
