/*
 * Divide and concur
 * Its a recursive function
 * Divides an array into two parts
 * then recursively calls itself
 * It only stops when the array is at the size of one
 * Then it uses a function to merge each element to the original sub-array
 *   RUNTIME = O (n log n)
 *  merge sort = recursively divide array in 2, sort , recombine
 */

public class MergeSort {
    public static void main (String [] Args) {
        int [] array = { 18,34,65,22,3,56,78,2,45,98,768};

        mergeSort(array);

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    } 

    private static void mergeSort (int[] array) {

        int length = array.length;

        //base case 
        if ( length <= 1) return;

        int middle = length/2;
        int [] leftArray = new int [middle];
        int [] rightArray =new int [ length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray [ j] = array [i];
                j++;
            }
        }
        //recursive case
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge( leftArray, rightArray, array);
    }
    private static void merge (int [] leftArray, int [] rightArray, int [] array) {
        int r;
        int l;
        int leftSize = array.length /2;
        int rightSize = array.length - leftSize;
        int i = 0; l = 0; r= 0; //indices

        //check merging conditions
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] <  rightArray[r]) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        else {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

    //copy remaining elements from leftArray
    while (l < leftSize) {
        array [i] = leftArray [l];
        i++;
        l++;
    }

    //copy remaining elements from rightArray
    while (r < rightSize) {
        array [i] = rightArray[r];
        i++;
        r++;
    }

    }
}
