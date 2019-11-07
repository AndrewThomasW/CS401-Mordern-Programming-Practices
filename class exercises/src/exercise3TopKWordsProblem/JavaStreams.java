package exercise3TopKWordsProblem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaStreams {
	public static void main(String[] args) throws IOException {
		
		//count number of words in lines of a file
		//
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		
			
		
		TernaryFunction<Integer,Integer,Integer,Integer> f =
				(x,y,z) -> x*x + y*y + z*z;
		 
		System.out.println(f.apply(1, 1, 1));
		
		
//		TernaryFunction<List<String>,Set<String>,Integer,List<String>> findTopKeyWords = 
//				(lines,stopWords,k) -> {
//					
//				};
		
		
		
		
		
		

	}
}
