
/*
 	1. Schreib ein Programm wo die Inhalt diese Datei (`Ich bin eine/r Programmier/in und üben wir heute zusammen`) wird als `ASCII` gelesen. Da muss das `try-catch` block  für Ausnahmebehandlung sein bsw. `FileNotFoundException` und `IOException`. Hinweis : nutzt diese `File`, `FileInputStream` und `InputStreamReader` das Code zu erzeugen.
	2. Wie kann die bestehende Programm ändern damit die Datei deutlich auf eure Rechner gelesebar sein wird.
	3. Schreib ein Programm wo die Zeichenkette (`Heute haben wir Java Programmierung zusammen geübt`) wird in eine Datei gespeichert. Da muss das `try-catch` block  für Ausnahmebehandlung sein bsw. `UnsupportedEncodingException` und `IOException`. Hinweis : nutzt diese `FileOutputStream` und `OutputStreamWriter` das Code zu erzeugen.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Ubung {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("./src/input.txt")); // Aufpassen die Java Programm läuft außerhalb des ./src Verzeichnis
			InputStreamReader isr = new InputStreamReader(fis, "ASCII");
			
			int temp = isr.read();
			while(temp >= 0) {
				System.out.print((char)temp);
				temp = isr.read();
			}
			isr.close();
			fis.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fistream = new FileInputStream(new File("./src/input.txt")); // Aufpassen die Java Programm läuft außerhalb des ./src Verzeichnis
			InputStreamReader stream = new InputStreamReader(fistream);

			int temp = stream.read();
			while(temp >= 0) {
				System.out.print((char)temp);
				temp = stream.read();
			}
			stream.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String s = "Heute haben wir Java Programmierung zusammen geübt";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./src/output.txt");	// Aufpassen die bestehende Datei wird ersetzt
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		OutputStreamWriter osw = null;
		try {
			osw = new OutputStreamWriter(fos, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		try {
			char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				osw.write(ch[i]);
			}
			osw.flush();
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
