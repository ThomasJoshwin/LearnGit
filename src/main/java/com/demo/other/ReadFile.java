package com.demo.other;

import java.io.File;

public class ReadFile {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\LENOVO\\Desktop\\csvFile";
		
		File file = new File(filePath);
		
		System.out.println("FileName"+file.getName());
		System.out.println("File size"+ file.getTotalSpace());
		int index = file.getName().indexOf('.');
		System.out.println("File extension"+file.getName().substring(index+1));
	}

}


