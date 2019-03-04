package _02_More_Algorithms;

import java.util.List;

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
	return 0;	
	}
}
