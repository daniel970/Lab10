package selectionSort;

import java.util.Scanner;

public class selectionSort {
	
	private int[] unsortedNumbers;
	
	public static void main(String[] args) {
		selectionSort mySorter = new selectionSort();
		mySorter.run();
		
	}
	
	public void run() {
		getNumber();
		runSelectionSort();
		
	}
	
	private void printResults() {
		for (int i=0;i <unsortedNumbers.length; i++) {
			system //출력
		}
	}
	
	public void runSelectionSort() {
		
		for(int i=0; i < unsortedNumbers.length-1; i++) {
			int indexOfSmallestNumber = getIndexOfSmallestNumber(i+1);
			swap(i, indexOfSmallestNumber);
		}
	}
	
	private void swap(int i, int indexOfSmallestNumber) {
		int temp = unsortedNumbers[i];
		
		unsortedNumbers[i] = unsortedNumbers[indexOfSmallestNumber];
		unsortedNumbers[indexOfSmallestNumber] = temp;
		
	}
	
	private int getIndexOfSmallestNumber(int startIndextoFindSmallNumber) {
		int indexOfSmallestNumber =startIndextoFindSmallNumber;
		for (int i= startIndextoFindSmallNumber; i < unsortedNumbers.length -1; i++) {
			if(unsortedNumbers[i] < unsortedNumbers[i+1]) {
				indexOfSmallestNumber = i;
			}else {
				indexOfSmallestNumber = i+1;
			}
		}
		
		return indexOfSmallestNumber;
	}

	public void getNumber() {
		System.out.println("how many numbers fo you want to sort?");
		Scanner input = new Scanner(System.in);
		
		int numOfNumbers = input.nextInt();
		
		unsortedNumbers = new int[numOfNumbers];
		
		for (int numberCount = 0; numberCount > numOfNumbers; numberCount++) {
			unsortedNumbers[numberCount] = input.nextInt();
		}
		input.close();
	}
}

//근데 array.sort() 하면 다해줌 ㅋ
