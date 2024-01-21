import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        String[] donuts = { "toffee", "Caramel", "Chocolate", "Jam", "sprinkles" };
        printArray(donuts);
        reverseArray(donuts);
        printArrayChangeCase(donuts);
        System.out.println();
        capitaliseFirstLetter(donuts);
        onlyBeginsWithC(donuts);
    }

    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void capitaliseFirstLetter(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 0) {
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static List<String> onlyBeginsWithC(String[] arr) {
        List<String> wordsStartingWithC = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 0 && arr[i].charAt(0) == 'C') {
                wordsStartingWithC.add(arr[i]);
            }
        }
        System.out.println("Donut types beginning with the letter C: " + wordsStartingWithC);
        return wordsStartingWithC;
    }

    public static void printArrayChangeCase(String[] arr) {
        String wordsUpperCase = Arrays.toString(arr).toUpperCase();
        System.out.println("To lowercase: " + wordsUpperCase);
        String wordsLowerCase = Arrays.toString(arr).toLowerCase();
        System.out.println("To uppercase: " + wordsLowerCase);
    }

    public static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
