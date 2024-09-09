
public class Day_1_ArraySorts012 {

    static void sort(int a[]) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                count0++;
            } else if (a[i] == 1) {
                count1++;

            } else {
                count2++;
            }
        }
        int i = 0;

        while (count0 > 0) {
            a[i] = 0;
            count0--;
            i++;

        }
        while (count1 > 0) {
            a[i] = 1;
            count1--;
            i++;

        }
        while (count2 > 0) {
            a[i] = 2;
            count2--;
            i++;

        }

        for (int j = 0; j < a.length; j++) {
            System.out.print(" " + a[j]);
        }

    }

    public static void main(String[] args) {
        int a[] = {1, 0, 2, 1, 2, 0, 1, 1, 0, 2, 1};
        sort(a);
    }
}
