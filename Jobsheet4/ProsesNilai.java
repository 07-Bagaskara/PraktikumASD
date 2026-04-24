package Jobsheet4;


public class ProsesNilai {

    // cari nilai UTS tertinggi (DC)
    int maxUTS(Nilai[] arr, int l, int r) {
        if (l == r) return arr[l].uts;

        int mid = (l + r) / 2;

        int left = maxUTS(arr, l, mid);
        int right = maxUTS(arr, mid + 1, r);

        return Math.max(left, right);
    }

    // cari nilai UTS terendah (DC)
    int minUTS(Nilai[] arr, int l, int r) {
        if (l == r) return arr[l].uts;

        int mid = (l + r) / 2;

        int left = minUTS(arr, l, mid);
        int right = minUTS(arr, mid + 1, r);

        return Math.min(left, right);
    }

    // rata-rata UAS (BF)
    double rataUAS(Nilai[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return (double) total / arr.length;
    }
}