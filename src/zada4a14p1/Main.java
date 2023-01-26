package zada4a14p1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = new int[10];
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr1[i] = arrInt[i];
            arr2[i] = arrInt[i+5];
            System.out.println(arr1[i]);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("asdas");
        }



    }

}
