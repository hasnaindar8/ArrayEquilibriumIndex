import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> getEquilibriumIndexes(int[] arr) {
        List<Integer> equilibriumIndexes = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return equilibriumIndexes; // Return empty list if input is null or empty
        }

        int totalSum = Arrays.stream(arr).sum();
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                // Store the equilibrium index
                equilibriumIndexes.add(i);
            }

            leftSum += arr[i];
        }

        return equilibriumIndexes;
    }

    public static void main(String[] args) {
        // int[] arr = {};
        int[] arr = {0, 1, 2, 1, 0};
        System.out.println(getEquilibriumIndexes(arr));
    }
}