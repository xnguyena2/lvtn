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
	static public String generaStringP(int[] P){
		String result = "";
		boolean[] hasSelected = new boolean[200];
		for(int i = 0;i<200;i++){
			int randomI = (int)(Math.random() * (200));
			while(hasSelected[randomI]){
				randomI++;
				randomI = randomI%200;
			}
			hasSelected[randomI] = true;
			P[i] = randomI;
			result += randomI;
			if(i!=199)
				result+=" ";
		}
		return result;
	}
	
	static public double[] permute(int[] P,double[] bio){
		double[] result = new double[200];
		for(int i = 0;i<200;i++){
			result[i] = bio[P[i]]; 
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(generaP()));
	}
	
}
