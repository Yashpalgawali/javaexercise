package com.example.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pathFileToRead = Paths.get("./resources/data.txt");

		// For small files
//		List<String> allLines = Files.readAllLines(pathFileToRead);
//		System.out.println(allLines);

		// For large files
		// the Files.lines() returns a stream , henc we can use forEach loop
//				Files.lines(pathFileToRead).forEach(System.out::println);

		
		// For large files
		// the Files.lines() returns a stream , henc we can use forEach loop
		
		 
		Files.lines(pathFileToRead)
				.map(String::toUpperCase)
				.filter(str -> str.contains("O"))
			.forEach(System.out::println);
	}

}
