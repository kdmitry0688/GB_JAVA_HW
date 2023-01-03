import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int num = 2;

        array1.add(5);
        array1.add(2);
        array1.add(1);
        array1.add(54);

        array2.add(5);
        array2.add(2);
        array2.add(1);
        array2.add(54);

        if (NumberOfMeetings(array1, array2, num)) {
            System.out.println(num + " встречается в обоих массивах одиноаковое колличество раз.");
        } else {
            System.out.println(num + " встречается разное колличество раз в массивах.");
        }
    }

    public static boolean NumberOfMeetings(ArrayList<Integer> array1, ArrayList<Integer> array2, int num) {

        int count1 = 0;
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) == num) {
                count1++;
            }
        }

        int count2 = 0;
        for (int i = 0; i < array2.size(); i++) {
            if (array2.get(i) == num) {
                count2++;
            }
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }
}