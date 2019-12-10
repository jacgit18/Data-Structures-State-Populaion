package edu.citytech.stateandpop.jc;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class TestReadFile2 {

	public static void main(String args[]) {
		
		Gson gson = new Gson();
		
		List <StateAndPopulation> list = new ArrayList<>();
		
		

                String fileName = "/data/StateAndPopulation.txt";
//		String fileName = "StateAndPopulation.txt";// Stored in the package can change directory to anything 

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(json -> {
				StateAndPopulation sp = gson.fromJson(json,StateAndPopulation.class);
				
				list.add(sp);
				System.out.println(sp);
				if(sp.getRank() <= 10);
			});
			
		}catch(IOException e){
		e.printStackTrace();
	}

}
}

