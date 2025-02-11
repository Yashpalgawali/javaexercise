package com.example.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {

		Path fileToWrite = Paths.get("./resources/file_write.txt");
		
		List<String> list = List.of("Apple","CAT","BAT");
		 
		if(Files.notExists(fileToWrite))
		{
			System.err.println("not exists file is created");
			Files.write(fileToWrite, list);
		}
		else {
			System.err.println("Exists");
		}
		Files.write(fileToWrite, list);
	
	}

}
