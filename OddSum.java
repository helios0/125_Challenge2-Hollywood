package etc;
//UIUC CS125 FALL 2014 MP. File: OddSum.java, CS125 Project: Challenge3-TopSecret, Version: 2015-02-16T06:59:09-0600.694848693
/**
 * Prints sum of odd numbers in a specific format. TODO: add your netid to the
 * line below
 * 
 * SAVE FOR MP 3
 * 
 * @author hlee295
 */
public class OddSum {

	public static void main(String[] args) {

		// ask a question

		int max = 0;
		long number = 0;
		while (max < 1) {
			System.out.println("Max?");
			max = TextIO.getlnInt();
			
		}

		long count = max;
		count = 0;
		String temp = "";
		while (count <= max) {
			if (count % 2 != 0 && count > 0)
				temp += count + " + ";
				//System.out.print(count + rows + " + ");
				
			if (count % 2 != 0)
				number = number + count;
			count++;
		}
		
		
		
		TextIO.put(temp.substring(0, temp.length() - 2) + "= " + number);

	}
}
