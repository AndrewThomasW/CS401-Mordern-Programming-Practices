package exercise3TopKWordsProblem;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) throws IOException {
		
		
		
		List<String> line = Arrays.asList("gilbert","jim","will","just","very","too","gilbert","jim","will","just","very","too");
		

		
		
		Set<String> stops = Files.lines(Paths.get("stops.txt"))
				.collect(Collectors.toSet());
		
		System.out.println( findTopkWords.apply(line,stops,3));
				
		
		
		/*List<String> names = Arrays.asList("Andrew Thomas", "Thomas Gilbert", "Gilbert Ssebaduka");

		Function<List<String>, Map<String, Long>> f = l -> l.stream()
				.flatMap(s -> Arrays.stream(s.split(" "))).collect(

				Collectors.groupingBy(Function.identity(), Collectors.counting())

		);
		
		
		System.out.println(f.apply(names));*/
	}
	
	static TernaryFunction< List<String>, Set<String>, Integer, List<String> > findTopkWords = 
			(lines,stopwords,k)->
	lines.stream()
	.flatMap(s -> Arrays.stream(s.split(" ")))
	.filter( w -> !stopwords.contains(w))
	.collect(Collectors.groupingBy(e -> e))
	.entrySet().stream().map(
			e -> {
				Map<String,Integer> m = new HashMap<>();
				m.put(e.getKey(),e.getValue().size());
				return m;
			})
	.flatMap( m -> m.entrySet().stream())
	.sorted((e1,e2) -> e2.getValue() - e1.getValue())
	.limit(k)
	.map(e -> e.getKey())
	.collect(Collectors.toList());
}
