import java.util.Arrays;
//Selection Sort
//Search throgh an array and and keep track of the minimum value in each iteration
//At the end of each of iteration we swap variablkes
//          Quadratic time = 0(n^2)
//            Good for small data sets only


public class SelectionSort {
    public static void main(String []Args){

        int array [] = {3,4,5,5,6,98,56,34,25};

        selectionSort (array);

        for(int i : array) {
            System.out.println(i);
        }
    }
    private static void selectionSort(int [] array) {
        int i ;
        for (i = 0; i< array.length-1; i++) {
            int min = i;
            for (int j = i; j < array.length  ; j++ ){
                if (array[min] >  array[j]){
                    min = j;
                } 
            }

            int temp = array [i];
            array[i] = array [min];
            array[min] = temp;
        }
    }
}
