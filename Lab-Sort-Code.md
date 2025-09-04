# This is the code for the sorting lab.
```
import java.util.Arrays;
import java.util.Random; //Source: https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/

public class Main {

    public static void main(String[] args)
    {
        Random random = new Random();
        int[] testArray = new int[random.nextInt(2,20)];
        for(int i=0; i<testArray.length; i++)
        {
            testArray[i] = random.nextInt(1,50);
        }
        sortArray(testArray, testArray.length);

    }

    public static void sortArray(int[] arr, int arrSize)
    {

        for(int i = 0; i < arrSize-1; i++)
        {
            for(int j = arrSize - 1; j > 0; j--) //Idea: Go in reverse through the array and bubble sort as if backwards were in ascending order.
            {
                //Idea from:https://beginnersbook.com/2014/07/java-program-for-bubble-sort-in-ascending-descending-order/
                //The moment I saw the bubble sort going in the nested for loop, I realized what I was doing wrong. I tried to work backwards, but instead, I needed the bubble sort to work backwards instead of trying to do it the more complicated way.
                if(arr[j] > arr[j-1]) //Use the bubble sort, if the current value is bigger than the value behind it.
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr [j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(arr)); //Print the array to make sure it's sorted.
    }
}
```
