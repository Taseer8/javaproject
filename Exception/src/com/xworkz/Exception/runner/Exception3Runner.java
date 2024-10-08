package com.xworkz.Exception.runner;

import java.security.cert.CertificateException;
import java.util.zip.ZipException;

import javax.swing.text.BadLocationException;

import com.xworkz.Exception.excception.Exception3;

public class Exception3Runner {

	public static void main(String[] args) throws Exception3  {
		
		try {
			int id = 45;
			int id1 = 35;
			if(id!=id1) {
				throw new BadLocationException("the above id students are belongs to here",id);
			}
			else {
				throw new BadLocationException("its not belongs to here ", id1);
			}

		
		}
		catch(BadLocationException id2) {
			System.out.println("students are:"+id2.getMessage());
			throw new Exception3();

		}
		
		
		

	}

}
