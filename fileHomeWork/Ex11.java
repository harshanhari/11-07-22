package fileHomeWork;

import java.io.File;

public class Ex11 {

	public static void main(String[] args) {

		try {
			File f10 = new File("doc.txt");

		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
