class sortData {
	public void asec(int[] numArray) {
		int temp;

		for(int i=0; i<numArray.length; i++) {
			for(int j=i+1; j<numArray.length; j++) {
				if(numArray[i]>numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}

		// printing the elements of array
		System.out.print("Ascending Order: ");
		for(int num : numArray) {
			System.out.print(num + " ");
		}

		System.out.println();
	}


	public void desc(int[] numArray) {
		int temp;

		for(int i=0; i<numArray.length; i++) {
			for(int j=i+1; j<numArray.length; j++) {
				if(numArray[i]<numArray[j]) {
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}

		// printing the elements of array
		System.out.print("Descending Order: ");
		for(int num : numArray) {
			System.out.print(num + " ");
		}

		System.out.println();
	}
}


public class P4A {
	public static void main(String[] args) {
		int[] intArray = {22, 31, 02, 15, 07, 19, 98};

		System.out.print("Elements of array: ");
		for(int num : intArray) {
			System.out.print(num + " ");
		}

		System.out.println();

		sortData s1 = new sortData();
		s1.asec(intArray);
		s1.desc(intArray);
	}
}
