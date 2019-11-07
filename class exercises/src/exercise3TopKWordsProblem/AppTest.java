package exercise3TopKWordsProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() throws IOException {

		List<String> lines = Arrays.asList("gilbert", "jim", "will", "just", "very", "too", "gilbert", "jim", "will",
				"just", "very", "too");

		Set<String> stops = Files.lines(Paths.get("stops.txt")).collect(Collectors.toSet());

		List<String> output = App.findTopkWords.apply(lines, stops, 3);

		List<String> input = Arrays.asList("gilbert", "jim");

		stops.add("very");
		stops.add("while");
		stops.add("is");
		stops.add("stop");

		assertEquals(input, output);

	}
}
