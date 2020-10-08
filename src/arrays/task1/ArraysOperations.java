package arrays.task1;

public class ArraysOperations {
    public int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public int sumOfArrays(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int arithmeticAverage(int[] array) {
        int average = 0;
        for (int i = 1; i < array.length; i++) {
            average = average + array[i];
        }
        average = average / array.length;
        return average;
    }

    public int[] oddNumbers(int[] array) {
        int [] oddNumbers = new int[50];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0)
                oddNumbers[i] = array[i];
        }
        return oddNumbers;
    }
}




