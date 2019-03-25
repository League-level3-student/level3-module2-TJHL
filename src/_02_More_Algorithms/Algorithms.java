package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms.Sorter;
import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int total=0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				total=total+1;
			}
		}
		return total;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest=0;
		for (int i = 0; i < peeps.size(); i++) {
			if(tallest<peeps.get(i)) {
				tallest=peeps.get(i);
			}
		}
	return tallest;	
	}
	
	public static String findLongestWord(List<String> words) {
		String longestWord="";
			for (int i = 0; i < words.size(); i++) {
				if((words.get(i).length()>longestWord.length())){
					longestWord=words.get(i);
				}
			}
		return longestWord;
	}
	
	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		for (int j = 0; j < results.size()-1; j++) {
			for (int i = 0; i < results.size()-1; i++) {
				if(results.get(i)>results.get(i+1)) {
					Double a=0.0;
					Double b=0.0;
					a=results.get(i);
					b=results.get(i+1);
					results.set(i, b);
					results.set(i+1, a);
				}
			}
		}
		return results;
	}
	
	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int j = 0; j < unsortedSequences.size()-1; j++) {
			for (int i = 0; i < unsortedSequences.size()-1; i++) {
				if(unsortedSequences.get(i).length()>unsortedSequences.get(i+1).length()) {
					String a="";
					String b="";
					a=unsortedSequences.get(i);
					b=unsortedSequences.get(i+1);
					unsortedSequences.set(i, b);
					unsortedSequences.set(i+1, a);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words){
		for (int i = 0; i < words.size()-1; i++) {
			if(words.get(i).compareTo(words.get(i+1))>2) {
				String a="";
				String b="";
				a=words.get(i);
				b=words.get(i+1);
				words.set(i, b);
				words.set(i+1, a);
			}
		}
		return words;
	}
}