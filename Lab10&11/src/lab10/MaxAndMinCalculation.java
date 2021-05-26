package lab10;

public class MaxAndMinCalculation {
	
	public int maxInteger (int array []) {
		int max;
		max = array[0];
		for(int i=0; i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	
	public int minInteger (int array []) {
		int min;
		min = array[0];
		for(int i=0; i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		return min;
	}

}
