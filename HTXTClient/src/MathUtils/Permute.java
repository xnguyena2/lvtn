package MathUtils;

import java.util.Arrays;

public class Permute {
	static public int[] generaP(){
		int[] result = new int[200];
		boolean[] hasSelected = new boolean[200];
		for(int i = 0;i<200;i++){
			int randomI = (int)(Math.random() * (200));
			while(hasSelected[randomI]){
				randomI++;
				randomI = randomI%200;
			}
			hasSelected[randomI] = true;
			result[i] = randomI;
		}
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(generaP()));
	}
	
}
