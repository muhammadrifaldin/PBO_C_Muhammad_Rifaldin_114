class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {}
}

class Pahlawan extends KarakterGame {

    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame {

    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

public class Main {
    public static void main(String[] args) {
        KarakterGame umum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}
