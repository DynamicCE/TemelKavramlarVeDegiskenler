import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaIO {

	public static void main(String[] args) throws IOException {
		File myFile = new File("file.txt");
		myFile.createNewFile();
		Scanner fileReader = new Scanner(myFile);
		FileWriter fileWritter = new FileWriter(myFile);
		fileWritter.write("Merhaba");
		fileWritter.write("\n Ben Eclipse");
	}

}
