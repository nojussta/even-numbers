import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{2, 3, 5, 6, 6, 2, 4, 8, 9, 4, 4, 6, 10, 12, 10};
        int[] nmb = new int[]{2, 3, 5, 6, 7, 11, 9, 6, 2, 4, 8, 9, 4, 4, 6, 10, 12, 10};
        var n = numbersInput(numbers);
        System.out.println(n);
        var result = selectEvenOccurrences(nmb);
        System.out.println(result);
    }

    public static ArrayList<Integer> selectEvenOccurrences(int[] input) {
        HashMap<Integer, Integer> firstOccurrences = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                if (!firstOccurrences.containsKey(input[i])) {
                    firstOccurrences.put(input[i], i);
                    result.add(input[i]);
                } else {
                    result.add(input[i]);
                }
            }
        }
        return result;
    }


    public static ArrayList<Integer> numbersInput(Integer[] list) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i : list) {
            numbers.add(list[i]);
        }
        return numbers;
    }
}