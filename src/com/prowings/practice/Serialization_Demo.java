package com.prowings.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_Demo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Seralization_practice sp = new Seralization_practice();
		
		FileOutputStream fos = new FileOutputStream("ACB.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sp);
		
		
		FileInputStream fis = new FileInputStream("ACB.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Seralization_practice sp2	=(Seralization_practice) ois.readObject();
		System.out.println(sp2);
		
	}

}
