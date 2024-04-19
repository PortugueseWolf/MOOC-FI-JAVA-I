package sorting;

public class MainProgram {
    public static void main(String[] args) {

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1];
        array[index1] = array[index2];
        array[index2] = first;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, index, i);
        }
    }
}
