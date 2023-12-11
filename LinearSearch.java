import java.util.Arrays;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String [] args) {

        //Linear search through a collection of elements one element a ta a time

        int [] array = {1,2,3,4,5,6,7,8,9,0};

        int index = linearSearch (array ,10);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element Not Found");
        }
    }

    private static int linearSearch (int [] array  , int value){
        for (int i = 0; i < array.length; i++){
            if (array [i] == value){
                return i;
            }
        }
        return -1;
    }
}
