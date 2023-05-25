import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int[] random(int min, int max, int[] arr) {
        int range = max - min + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range) + min;
        }
        return arr;
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, mid, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int SIZE = 50000;
        int[] arr = new int[SIZE];

        random(1, 2000, arr);
        long startTime = System.currentTimeMillis();
        mergeSort(arr);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        for (int a : arr
        ) {
            System.out.println(a + "\n");
        }
        System.out.println("Час виконання: " + elapsedTime + " мс");


    }


}

