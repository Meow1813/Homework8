import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr3[i] = i;
        }

        System.out.println("Задание 2");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("Задание 3");
        int swapNumber;
        for (int i = 0; i < arr1.length / 2; i++) {
            swapNumber = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = swapNumber;
        }
        double numberSwap;
        for (int i = 0; i < arr2.length / 2; i++) {
            numberSwap = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = numberSwap;
        }
        for (int i = 0; i < arr3.length / 2; i++) {
            swapNumber = arr3[i];
            arr3[i] = arr3[arr3.length - 1 - i];
            arr3[arr3.length - 1 - i] = swapNumber;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("Задание 4");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] % 2 != 0 ? ++arr1[i] : arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}