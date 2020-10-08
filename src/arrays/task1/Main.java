package arrays.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {55, 21, 31, -12, -35, -89, 7, 87, 88, 1};
        ArraysOperations arraysOperations = new ArraysOperations();
        System.out.println(arraysOperations.minArray(array));
        System.out.println(arraysOperations.maxArray(array));
        System.out.println(arraysOperations.sumOfArrays(array));
        System.out.println(arraysOperations.arithmeticAverage(array));
        System.out.println(Arrays.toString(arraysOperations.oddNumbers(array)));
        }
    }




