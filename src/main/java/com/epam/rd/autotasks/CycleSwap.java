package com.epam.rd.autotasks;
import java.util.Arrays;
class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length < 2) {
            return;
        }
        int lastElement = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = lastElement;
    }
    static void cycleSwap(int[] array, int shift) {
        if (array.length < 2 || shift % array.length == 0) {
            return;
        }
        shift = shift % array.length;
        int[] temp = Arrays.copyOfRange(array, array.length - shift, array.length);
        System.arraycopy(array, 0, array, shift, array.length - shift);
        System.arraycopy(temp, 0, array, 0, shift);
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array1);
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array2, 2);
        System.out.println(Arrays.toString(array2));
        int[] array3 = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array3, 5);
        System.out.println(Arrays.toString(array3));
    }
}

