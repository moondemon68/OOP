abstract class Kendaraan {
    protected int nomor;
    protected int tahun;
    protected String merk;

    public Kendaraan() {
        this.nomor = 0;
        this.tahun = 0;
        this.merk = "XXX";
    }

    public Kendaraan(int nomor, int tahun, String merk) {
        this.nomor = nomor;
        this.tahun = tahun;
        this.merk = merk;
    }

    public void printInfo() {
        System.out.println("Nomor: " + this.nomor);
        System.out.println("Tahun: " + this.tahun);
        System.out.println("Merk: " + this.merk);
    }

    abstract public int biayaSewa(int lamaSewa);
}