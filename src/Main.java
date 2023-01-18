import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 1, 3, 4, 5, 6, 2, 4, 6};
        var n = numbersInput(numbers);
        System.out.println(n);
        var result = selectEvenOccurrences(n);
        System.out.println(result);
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