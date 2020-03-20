class Mobil extends Kendaraan {
    private String supir;
    
    public Mobil() {
        super();
        this.supir = "XXXX";
    }

    public Mobil(int nomor, int tahun, String merk, String supir) {
        super(nomor, tahun, merk);
        this.supir = supir;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Kategori: Mobil");
        System.out.println("Supir: " + this.supir);
    }

    public int biayaSewa(int lamaSewa) {
        return 500000 * lamaSewa;
    }
}