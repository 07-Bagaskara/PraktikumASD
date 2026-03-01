package Jobsheet3;

public class DataDosen08 {

    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        for (Dosen08 d : arrayOfDosen) {
            d.tampilkanInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jumlahPria));
        if (jumlahWanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jumlahWanita));
    }

    
    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 tertua = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanInfo();
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 termuda = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanInfo();
    }
}