package BubbleSort;

import java.util.Arrays;

import static BubbleSort.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};

        bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
