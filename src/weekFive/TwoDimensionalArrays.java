package weekFive;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        double[][] array2 = new double[4][3];
        array2[0][0] = 1.1;
        array2[0][1] = 1.2;
        array2[0][2] = 1.3;
        array2[1][0] = 2.1;
        array2[1][1] = 2.2;
        array2[1][2] = 2.3;
        array2[2][0] = 3.1;
        array2[2][1] = 3.2;
        array2[2][2] = 3.3;
        array2[3][0] = 4.1;
        array2[3][1] = 4.2;
        array2[3][2] = 4.3;

        System.out.println("Array 2");
        for (double[] outerArray : array2) {
            for (double element : outerArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        String[][] array3 = {
                {"Java", "is", "painful"},
                {"This", "is", "a"},
                {"Cry", "for", "help"}
        };

        System.out.println("Array 3:");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
