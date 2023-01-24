import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 1, 3, 4, 5, 6, 2, 4, 6};
        var n = numbersInput(numbers);
        System.out.println(n);
        var result = selectEvenOccurrences(n);
        System.out.println(result);
        int[] input = {1, 2, 3};
        System.out.println(findMostFrequent(input));
    }

//    pradinis masyvas, su skaičiais, turi surasti, kuris iš tų skaičių dažniausiai kartojasi
//    ir grąžinti to skaičiaus indeksą pradiniame masyve
//    pvz int[] input = {1, 3, 4, 5, 3, 6, 3}, tai turi grąžinti 6
//    paskutinę jo vietą pradiniame masyve
//    int[] input = {1, 2, 3} -1 turėtų grąžinti

    public static int findMostFrequent(int[] input) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int key = input[i];
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            } else {
                map.put(key, 1);
                indexMap.put(key, i);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > max) {
                max = value;
                maxIndex = indexMap.get(key);
            }
        }
        if (maxIndex == 0) return -1;
        return maxIndex;
    }


    public static ArrayList<Integer> selectEvenOccurrences(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenOcc = new ArrayList<>();
        var n = numbers.size();
        for (int i = 0; i < n; i++) {
            if ((numbers.get(i) % 2 == 0)) {
                evenOcc.add(numbers.get(i));
            }
        }
        return evenOcc;
    }

    public static ArrayList<Integer> numbersInput(Integer[] list) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i : list) {
            numbers.add(list[i]);
        }
        return numbers;
    }
}