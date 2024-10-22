public class MaximumOfArray {

    // Recursive method to find the maximum of an array
    public static int findMax(int[] arr, int n) {
        // Base case: if there is only one element in the array, return that element
        if (n == 1) {
            return arr[0];
        }

        // Recursive call to find the maximum of n-1 entries of the array
        int maxOfNMinus1 = findMax(arr, n - 1);

        // Compare the maximum of n-1 entries with the last entry a[n-1]
        if (maxOfNMinus1 > arr[n - 1]) {
            return maxOfNMinus1;
        } else {
            return arr[n - 1];
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 1, 9, 5}; // Example array

        // Call the findMax method to find the maximum of the array
        int max = findMax(array, array.length);

        // Print the maximum of the array
        System.out.println("Maximum of the array: " + max);
    }
}
