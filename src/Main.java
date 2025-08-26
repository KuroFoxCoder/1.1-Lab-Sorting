import java.util.Arrays;
import java.util.Random; //Source: https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/

public class Main {

    public static void main(String[] args)
    {
        int[] testArray = {1,8,4,5,2,3,7};
        sortArray(testArray, testArray.length);

    }

    public static void sortArray(int[] arr, int arrSize)
    {
        for(int i = 0; i < arrSize-1; i++)
        {
            if(arr[i] < arr [i+1])//Executes if current value is lower than one ahead
            {
                
            }
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
