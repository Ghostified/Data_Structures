/* Create a temp value
 * Store first element in temp
 * examine the elements in the left of the index of the array stored on temp are:
 * if the elements are greater than temp store temp as the first index shift to right
 * if the elements are less than temp store the element at the index
 * repeat
 * insertion sort =  after comparing items to the left
 *                  shift elements in the array to the right to male room to insert value
 *                  
 *              quadratic time = O(n^2)
 *              omega time = O(n)
 *              
 */
public class InsertionSort {
    public static void main( String[] Args){
        int array [] = {67, 45,78,89,46,3,2,56,};

        insertionSort (array);
        for (int i : array){
            System.out.print(i + " ");  
        }
    }

    private static void insertionSort(int [] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array [j] > temp) {
                array[ j + 1] = array[j];
                j--;
            }
            array [j + 1] = temp;
        }

    }
    
}
