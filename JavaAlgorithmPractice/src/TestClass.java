import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestClass {

	public static void main(String[] args) {

		
		URLShortener test = new URLShortener();
		test.addURL("google.com");
		test.addURL("yahoo.com");test.addURL("aol.com");
		test.printMap();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addURL("aol.com");
		System.out.println("Slept 6 seconds");
		test.printMap();
	}


	

}
