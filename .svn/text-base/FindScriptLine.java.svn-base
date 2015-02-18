//UIUC CS125 FALL 2014 MP. File: FindScriptLine.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T07:29:06-0600.676067676
/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author hlee295
 */
public class FindScriptLine {

	public static void main(String[] args) {
		
		String name=""; 
		int count = 0;
		TextIO.putln("Please enter the word(s) to search for");
		name = TextIO.getln();	
		TextIO.putln("Searching for " + "'" + name + "'");
		TextIO.readFile("thematrix.txt");
		String name2 = name.toLowerCase();

		
		while (TextIO.eof() == false) {
			String word = TextIO.getln();
			count++;
			
			String word2 = word.toLowerCase();
			
			if (word2.indexOf(name2) >= 0) {
				word = word.trim();
				TextIO.putln(count + " - " + word);

			}
						

		}
		System.out.println("Done Searching for " + "'" + name + "'");
			

// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest		
		
		
	}
	
}
