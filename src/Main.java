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
        int[] input = {1, 3, 4, 5, 3, 6, 3};
        System.out.println(findMostFrequent(input));
    }

    //    pradinis masyvas, su skaičiais, turi surasti, kuris iš tų skaičių dažniausiai kartojasi
//    ir grąžinti to skaičiaus indeksą pradiniame masyve
//    pvz int[] input = {1, 3, 4, 5, 3, 6, 3}, tai turi grąžinti 6
//    paskutinę jo vietą pradiniame masyve
//    int[] input = {1, 2, 3} -1 turėtų lygtais grąžinti
    public static int findMostFrequent(int[] input) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
//        int max = -1;
//        int index = -1;
//        for (int i = 0; i < input.length; i++){
//            if (hash.containsKey(input[i])){
//                int value = hash.get(i);
//                value++;
//                hash.get(value);
//                if (hash.get(i) >= max){
//                    max = hash.get(input[i]);
//                    index = i;
//                }
//            }
//            hash.get(input[i]);
//        }
//        if (max == 1 && max == -1){
//            return -1;
//        }
//        return index;
        for (int i : input) {
            Integer freq = hash.get(i);
            hash.put(i, (freq == null) ? 1 : freq + 1);
        }

        int max = -1;
        int index = 0;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> e : hash.entrySet()) {
            if (e.getValue() > max) {
                mostFrequent = e.getKey();
                max = e.getValue();
            }
        }
        return mostFrequent;
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