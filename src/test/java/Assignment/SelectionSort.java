package Assignment;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        int[] arr = {27, 76, 17, 9, 45, 58, 90, 79};
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum element in remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Print array after each pass
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
