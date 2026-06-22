package com.exceptionhandling;
import java.io.File;
public class TestException2 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\VENNA\\OneDrive\\Desktop\\practice\\student.txt");
		try {
			boolean status=f.createNewFile();
			if(status) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("Something went wrong");
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
