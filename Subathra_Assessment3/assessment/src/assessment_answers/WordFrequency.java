package assessment_answers;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordFrequency {

	public static void main(String[] args) {
		
		Path p = Paths.get("Documents\\Words.txt");
		
		try {
			
			throw new FileNotFoundException("File Not found");
			
		}
		
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		
		

	}

}
