import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    current = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = current;
                }
            }
        }
    }
}
