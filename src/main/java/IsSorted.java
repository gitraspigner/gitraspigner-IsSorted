import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        List<Integer> sorted = new ArrayList<Integer>();
        //copy.addAll(Arrays.asList(arr)); //couldn't get this to work
        for (int i = 0; i < arr.length; i++) {
            sorted.add(arr[i]);
        }
        Collections.sort(sorted);
        //Collections.reverse(copy);  //now sorted least to greatest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sorted.get(i)) {
                return false;
            }
        }
        return true;

    }
}