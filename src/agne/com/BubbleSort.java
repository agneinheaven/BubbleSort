package agne.com;

public class BubbleSort {
	
	public static void main (String[] args) {
		int numbers[] = {-1, -5, 7, 9, 0, 4, 3};
		bubbleSort(numbers);
		for (int number:numbers) {
			System.out.print(number + ", " + " ");
		}
		
	}

public static void bubbleSort(int[] numbers) {
	boolean numbersSwitched;
	do {
		numbersSwitched = false;
		for (int i = 0; i < numbers.length -1; i++) {
			if (numbers[i+1] < numbers[i]) {
				int tmp = numbers[i+1];
				numbers[i+1] = numbers[i];
				numbers[i] = tmp;
				numbersSwitched = true;
			}
		}
	}while (numbersSwitched);
  }   
}
