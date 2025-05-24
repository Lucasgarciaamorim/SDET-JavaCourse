package Java.Primitives;

import java.util.Arrays;

public class ArraysTypes {
    public static void main(String[] args) {
        int[] arr;
        int arr2[];

        arr = new int[10];
        System.out.println(arr[0]);

        double[] arr3 = new double[10];
        System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);
        System.out.println(arr4[9]);

        int[] arr5 = {3, 2, 1};

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {4, 5, 2}


        };
        System.out.println(matrix[0][2]);

        int[][] matrix2 = new int[10][10];
        System.out.println(matrix2[0]);
        System.out.println(Arrays.toString(arr5));


    }
}

//What we have learned today?
//What arrays are
//Default values for primitive types
//Multidimensional arrays
//import statement
//How to investigate JDK source code
//java.util.Arrays
