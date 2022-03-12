public class P3C {
	public static void main(String[] args) {
		int[] intArray = {22, 13, 02, 15, 07, 19, 98};
		int smallestNumber = intArray[0];
		int largestNumber = 0;

		System.out.print("Elements of array: ");
		for(int num : intArray) {
			System.out.print(num + " ");
		}

		System.out.println();


		for(int num : intArray) {
			if(num > largestNumber) {
				largestNumber = num;
			}
			else if(num < smallestNumber) {
				smallestNumber = num;
			}
		}

		System.out.println("Smallest element: " + smallestNumber);
		System.out.println("Largest element: " + largestNumber);


		// Arrays.sort(intArray);  // sorted the original array in ascending order
		// System.out.println("Smallest element of array: " + intArray[0]);
		// System.out.println("Largest element of array: " + intArray[intArray.length-1]);
	}
}
