package edu.citytech.stateandpop.jc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestReadFile {


	public static void main(String args[]) {

		String fileName = "/home/jac/eclipse-workspace/StateAndPopulation.txt";
		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			System.out.println("hello world");
//			// the method is being passed like a variable
//			Consumer<String> x;
//			stream.forEach(TestReadFile::booboo);

			
			
			
			
//			// x data type is a "consumer of strings" in this situation 
//			Consumer<String> x = e -> {
//				System.out.println(e.toLowerCase());
//			};
			
			
			
			
			// comment out these two lines to run code above
			Consumer<Integer> ic = e -> {};
			
			Consumer<String> x = null;
			String mode = "l"; // change between the three values changes output case 
			
			if( mode.equals("u"))
				x = AllMyWork::uppercase;
			
			else if( mode.equals("l"))
				x = AllMyWork::lowercase;
			
			else if (mode.equals("s")) {
				x = System.out::println;

				
			}
			
			
//			x = TestReadFile::booboo;
//			x = System.out::println;
			
			
			// comment out middle part to test out outer code
			stream.forEach(x);

//			stream.forEach(TestReadFile::booboo);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
