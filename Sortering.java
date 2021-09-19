class Sortering {

	public static void main(String[] args) {
 		int [] num = {5, 2, 47, 7, 23, 13, 41, 29, 53, 11};
		int [] Alex = {05, 2004, 19};
		System.out.println("foer Sortering:");
		printArray(num);
			System.out.println(""); // laver mellemrum mellem "num" & "Efter Sortering"
		printArray(Alex);

		sort(num);
		sort(Alex);

		System.out.println("");

		System.out.println("Efter Sortering:");
		printArray(num);
		System.out.println("");
		printArray(Alex);

 }

	public static int[] sort(int[] arr){	// sorterings funktion
		for (int i = 1; i <  arr.length; i++) {
				int key = arr[i];
				int j = i - 1;

				while ( j >= 0 && arr[j] > key ) {
						arr [j + 1] = arr[j];
						j--;
				}
				arr[j+1] = key;
		}
		return arr;
	}

	public static void printArray(int[] arr2){ // Funktion der kalder en arry
		for(int i: arr2){
			System.out.print(i+", ");
		}

	}
}
