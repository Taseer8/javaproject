package com.xworkz.FileOperation.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.FileOperation.dto.MovieDto;

public class MovieRunner {

	public static void main(String[] args) {

		MovieDto name = new MovieDto("Devara", 3.2, 2024);
		File file = new File("MovieDto.xlsx");
		System.out.println("MovieFile:"+file);
		try {
			if(!file.exists()) {
				if(file.createNewFile()) {
					System.out.println("file created");
					addObject(name, file);
				}
			}else {
				System.out.println("hi");
				addObject(name, file);
			}
		}catch(IOException e){
			System.out.println("file not created");	
		}
		Object obe = read(file);
		System.out.println(obe);


	}

	private static void addObject(MovieDto name, File file) throws IOException {
		try(FileOutputStream out = new FileOutputStream(file);
				ObjectOutputStream in = new ObjectOutputStream(out)){
			in.writeObject(name);
			System.out.println("done is inserted");

		}catch(FileNotFoundException e) {
			System.out.println("file not created");
		}
	}
	private static Object read(File file) {
		try(FileInputStream filein = new FileInputStream(file);
				ObjectInputStream fileread = new ObjectInputStream(filein) ){
			return	fileread.readObject();
		}
		catch(IOException |ClassNotFoundException e) { 
			System.out.println("cant read "+e.getMessage());
			return new Object();

		} 
	}

}

