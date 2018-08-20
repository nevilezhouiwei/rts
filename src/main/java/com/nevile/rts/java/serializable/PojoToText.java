package com.nevile.rts.java.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class PojoToText {
	@Test
	public void noSerizlizable() {
		try {
			Person2 aPerson = new Person2((long)1,19,"zhou","wei");
			String path = "D:\\test\\serilizable.txt";
			File file = new File(path);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
			out.writeObject(aPerson);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void hasSerizlizable() {
		try {
			Person aPerson = new Person((long)1,19,"zhou","wei");
			String path = "D:\\test\\serilizable.txt";
			File file = new File(path);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
			out.writeObject(aPerson);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void deSerilizable() {

		try {
			String path = "D:\\test\\serilizable.txt";
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(path));
			Person aPerson = (Person) input.readObject();
			System.out.println(aPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		
	}
	

}
