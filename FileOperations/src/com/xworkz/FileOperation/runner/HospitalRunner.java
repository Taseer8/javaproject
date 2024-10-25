package com.xworkz.FileOperation.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.FileOperation.dto.HosptialDto;


public class HospitalRunner {
	public static void main(String[] args) {
		
	HosptialDto dto = new HosptialDto("jayadava","btm","cardologi",500,7000);
	File file = new File("Hopital.txt");
	try {
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("file created");
				addObject(dto, file);
				}
			else {
				System.out.println();
				addObject(dto, file);
			}
		}
	}catch(IOException e){
		System.out.println("file not created");	
		
	}
	Object obe = read(file);
	System.out.println(obe);
}
	
	private static void addObject(HosptialDto dto, File file) throws IOException {
		try(FileOutputStream out = new FileOutputStream(file);
				ObjectOutputStream in = new ObjectOutputStream(out)){
			in.writeObject(dto);
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
