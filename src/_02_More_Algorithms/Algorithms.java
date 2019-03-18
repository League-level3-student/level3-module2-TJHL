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
	public static Double sortScores(List<Double> results) {
		return null;
	}
}



/*
		for (int j = 0; j < results.size()-1; j++) {
			
			for (int i = 0; i < results.size()-1; i++) {
				if(results[i]>results[i+1]) {
					double a=0;
					double b=0;
					a=results[i];
					b=results[i+1];
					results[i]=b;
					results[i+1]=a;
				}
			}
		}
	}
*/