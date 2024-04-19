package readymadealgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //int[] intArray = {3, 1, 5, 99, 3, 12};
        //String[] stringArray = {"charlie", "bravo", "alfa"};
        //sort(intArray);
        //System.out.println(Arrays.toString(intArray));
        //sort(stringArray);
        //System.out.println(Arrays.toString(stringArray));
        //ArrayList<Integer> numberList = new ArrayList<>();
        //ArrayList<String> wordsList = new ArrayList<>();
        //numberList.add(55);
        //numberList.add(22);
        //numberList.add(33);
        //wordsList.add("charlie");
        //wordsList.add("alfa");
        //wordsList.add("bravo");
        //sortIntegers(numberList);
        //sortStrings(wordsList);
        //System.out.println(numberList);
        //System.out.println(wordsList);


    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
