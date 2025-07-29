package com.prowings.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test7 {

	// /Test/src/com/prowings/practice/input.txt
	// E:\J12_STS_WorkSpace\Test\src\com\prowings\practice\input.txt
	public static void main(String[] args) {

		// String path = "input.txt";
		String path = "E:\\J12_STS_WorkSpace\\Test\\src\\com\\prowings\\practice\\input.txt";

		int count = 0;
		try {

			FileInputStream file = new FileInputStream(path);

			String content = file.readAllBytes().toString();

			// String content = new String(Files.readAllBytes(Paths.get(path)));

			if (content.toLowerCase().contains("Interview")) {

				System.out.println("File contains Interview");

			}

			String[] word = content.split("\\w+");
			for (String words : word) {

				if (word.equals("Interview")) {
					count++;
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Count of interview = " + count);

	}

}
