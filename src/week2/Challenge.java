package week2;

public class Challenge {

	public static void main(String[] args) {

		System.out.println(getIndexOfEqualSums(new int[] {3, 4, 2, 1, 5, 6, 4}));
		System.out.println(getIndexOfEqualSums(new int[] {100, 45, 25, 51, 24}));
		System.out.println(getIndexOfEqualSums(new int[] {1, 5, 2, 4, 3, 4, 6, 19}));
		
	}
	
	// {3, 4, 2, 1, 5, 6, 4} 4
	// {100, 45, 25, 51, 24} 1
	// {1, 5, 2, 4, 3, 4, 6, 19} 6
	
	static int getIndexOfEqualSums(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum += array[j];
			}
			for (int j = array.length - 1; j > i; j--) {
				rightSum += array[j];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

}
