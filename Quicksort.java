/*
 * Pass array to a quicksort function
 * Pick a pivot at the end of the array
 * Declare and use two indices use a temp variable to swap value
 * check if the array elements are >= to the pivot
 * quicksort = moves smaller elements to the left of the partition'
 *              recursively divided the array into 2 partition
 * time complexixity= Best case o(n log (n))
 *                     Average case o (n log (n))
 *                      Worst Case o(n ^2)
 * space complexity = o(log(n)) due to recursion
 */
public class Quicksort {

    public static void main(String[] Args){
        int [] array = {4,5,3,1,7,9,0};

        quickSort(array, 0, array.length -1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    private static void quickSort(int array  [], int start, int end) {
        if (end <= start) return; //base case

        int pivot = partition( array, start, end);
        quickSort (array, start, pivot -1);
        quickSort(array, pivot +1, end);
    }

    private static int partition (int [] array, int start, int end) {
        int pivot = array [end];
        int i = start -1;

        for  (int j = start; j <= end -1; j++) {
            if (array [j] < pivot) {
                i++;
                int temp = array [i];
                array [i] = array [j];
                array [j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
    
}
