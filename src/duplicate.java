import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8};
        List<Integer> repeatedEvenNumbers = new ArrayList<>();
        Set<Integer> distinctEvenNumbers = new HashSet<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                if (distinctEvenNumbers.contains(number)) {
                    repeatedEvenNumbers.add(number);
                } else {
                    distinctEvenNumbers.add(number);
                }
            }
        }
        System.out.println("Tekrar eden çift sayılar:");
        for (int number : repeatedEvenNumbers) {
            System.out.println(number);
        }
    }
}