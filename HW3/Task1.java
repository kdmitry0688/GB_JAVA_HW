import java.util.ArrayList;

// На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
// Нужно реализовать алгоритм, не использовать метод equals.

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        array1.add(5);
        array1.add(2);
        array1.add(1);
        array1.add(54);

        array2.add(5);
        array2.add(2);
        array2.add(1);
        array2.add(54);
        if (Comparison(array1, array2)) {
            System.out.println("Массивы равны.");
        } else {
            System.out.println("Массивы не равны.");
        }
    }

    public static boolean Comparison(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        if (array1.size() != array2.size()) {
            return false;
        }
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) != array2.get(i)) {
                return false;
            }
        }
        return true;
    }
}