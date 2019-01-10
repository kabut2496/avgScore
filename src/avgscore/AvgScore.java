
/*
 * AvgScore.java from Chapter 12
 * A program that demonstrates processing numeric data.
 *
 */

package avgscore;

 
 import java.io.*;
 
 /**
  * A program that calculates the average from a set of scores
  * stored in a text file containing one numeric score per line.
  */
 public class AvgScore {

	public static void main(String[] args) {
		File dataFile = new File("scores.dat");
		FileReader in;
		BufferedReader readFile;
		String score;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		
		try {
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
    		while ((score = readFile.readLine()) != null ) {
    			numScores += 1;
    			System.out.println(score);
    			totalScores += Double.parseDouble(score);
    		}
    		avgScore = totalScores / numScores;
    		System.out.println("Average = " + avgScore);	
			readFile.close();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
                        System.err.println("IOException: " + e.getMessage());
    	}
	}	
 }
