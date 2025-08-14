package Arrays;

public class TRry {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int Mmax = 0;
        int Lmax = 0;
        int Rmax = 0;
        int w = 0;
        int ww = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Mmax < arr[i]) {
                Mmax = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (Mmax == arr[i]) {
                Mmax = i;
            }
        }

        for (int i = 0; i < Mmax; i++) {
            if (Lmax < arr[i]) {
                Lmax = arr[i];
            }

        }
        for (int i = Mmax + 1; i < arr.length; i++) {
            if (Rmax < arr[i]) {
                Rmax = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (Lmax == arr[i]) {
                Lmax = i;
            }
            if (Rmax == arr[i]) {
                Rmax = i;
            }

        }

        for (int i = Lmax; i < Mmax; i++) {
            w = w + (arr[i] - arr[i + 1]);
        }

        for (int i = Rmax; i < Mmax; i--) {
            ww = ww + (arr[i] - arr[i - 1]);
        }
        System.out.println(w + ww);
    }

}
