package ru.array;

public class Merge { // new array consist from 2 array
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int z = 0;
        for(int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            z++;
        }
        for(int j = 0; j < right.length; j++) {
            rsl[z++] = right[j];
        }
        return rsl;
    }
}
