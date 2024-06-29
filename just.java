import java.util.Arrays;

        public class just {

            public static void main(String[] args) {

                int[] array1 = {1, 2, 2, 3,4, 4,5};
                int[] array2 = {1,2, 3,5};


                System.out.println("Array1 : " + Arrays.toString(array1));
                System.out.println("Array2 : " + Arrays.toString(array2));


                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array2.length; j++) {
                        if (array1[i] == (array2[j])) {
                            // Print the common element.
                            System.out.println("Common element is : " + (array1[i]));
                        }
                    }
}
}
}

