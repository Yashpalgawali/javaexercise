package com.example.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException{
		
		Path currentDirectory = Paths.get(".");

		// Files.list(currentDirectory).forEach(System.out::println);
				
		// Method 1 to search the directories 
//		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
//		
//		Files.walk(currentDirectory, 6)
//			.filter(predicate)
//			.forEach(System.out::println);
		
		
		// Method 2 to search the files under directories
		
//		BiPredicate<Path, BasicFileAttributes> matcher = (path , attribute) -> String.valueOf(path).contains(".java");
//		Files.find(currentDirectory, 5, matcher ).forEach(System.out::println);
//		
		// Method to get only the directories
		
		BiPredicate<Path, BasicFileAttributes> matcher = (path ,attr ) -> attr.isDirectory() ;
		Files.find(currentDirectory, 5, matcher ).forEach(System.out::println);
		
	}
}
