import java.util.Arrays;
public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static int[] compareSearch(int[] array, int number) {
		Arrays.sort(array);

		int[] numLoop = new int[2];
		int count = 0;
		//Sequential search
		for(int i = 0; i < array.length; i++) {
			count++;
			if(array[i] == number) {
				count = i + 1;
				i = array.length + 1;
			}
				
		}
		numLoop[0] = count;
		count = 0;
		//Binary search
		
		int low = 0, mid, high = array.length - 1;

		while(low <= high) {
			count++;
			mid = (high + low) / 2;
			if(number == array[mid]) {
				low = high + 1; 
				//end loop
			}else if(number > array[mid]) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		numLoop[1] = count;
		
		return numLoop;
		

	}


	public static int[] compareStringSearch(String[] array, String word) {
		Arrays.sort(array);

		int[] numOfLoops = new int[2];
		int counter = 0;
		//Sequential search
		for(int i = 0; i < array.length; i++) {
			counter++;
			if(array[i] == word) {
				counter = i + 1;
				i = array.length + 1;
			}
				
		}
		numOfLoops[0] = counter;
		counter = 0;
		//Binary search
		
		int low = 0, mid, high = array.length - 1;

		while(low <= high) {
			counter++;
			mid = (high + low) / 2;
			if(word == array[mid]) {
				low = high + 1; 
				//end loop
			}else if(word.compareTo(array[mid]) > 0) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		numOfLoops[1] = counter;
		
		return numOfLoops;
		

	}
	
}