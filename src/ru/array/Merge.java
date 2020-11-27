package ru.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int ileft = 0;
        int iright = 0;
        for (int irsl = 0; irsl < rsl.length; ++irsl) {
            if (ileft < left.length) {
                if (iright < right.length) {
                    if (left[ileft] < right[iright])
                        rsl[irsl] = left[ileft++];
                    else
                        rsl[irsl] = right[iright++];
                } else {
                    rsl[irsl] = left[ileft++];
                }
            } else
                rsl[irsl] = right[iright++];
        }
        return rsl;
    }
}