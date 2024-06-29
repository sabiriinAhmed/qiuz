import java.util.Arrays;
public class just2 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3 };
        int[] resultArray = removeDuplicates(inputArray);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] removeDuplicates(int[] array) {
        if (array.length == 0) return array;

        Arrays.sort(array);
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j]) {
                array[++j] = array[i];
            }
        }

        return Arrays.copyOf(array, j + 1);
    }
}
