//UIUC CS125 FALL 2014 MP. File: MovieSurvey.java, CS125 Project: Challenge2-Hollywood, Version: 2015-02-09T07:29:06-0600.676067676
/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author hlee295
 * 
 * DONE DONE DONE
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		
		TextIO.putln("Welcome. We're interested in how people are watching movies this year.");
		TextIO.putln("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		TextIO.putln("Please tell us about how you've watched movies in the last month.");

		TextIO.putln("How many movies have you seen at the cinema?");
		long cinema = TextIO.getlnInt();
		
		TextIO.putln("How many movies have you seen using a DVD or VHS player?");
		long dvd = TextIO.getlnInt();

		TextIO.putln("How many movies have you seen using a Computer?");
		long computer = TextIO.getlnInt();
		
		
		System.out.print("Summary: ");
		System.out.print(cinema + " Cinema movies, ");
		System.out.print(dvd + " DVD/VHS movies, ");
		System.out.println(computer + " Computer movies");
		long total = (cinema+dvd+computer);
		
		double cinemaperc;
		double outcinemaperc;
		TextIO.putln("Total: " +total+ " movies");
		cinemaperc = (double)cinema/total*100;
		outcinemaperc = (double)(dvd+computer)/total*100;
		
		

		TextIO.putf("Fraction of movies seen at a cinema: " + "%.2f", cinemaperc);
		TextIO.putln("%");
		TextIO.putf("Fraction of movies seen outside of a cinema: ");
		TextIO.putf("%.2f", outcinemaperc);
		TextIO.putln("%");

				
	

	}
}


	



