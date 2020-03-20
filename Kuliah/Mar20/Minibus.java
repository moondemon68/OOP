class Minibus extends Kendaraan {
    public Minibus() {
        super();
    }

    public Minibus(int nomor, int tahun, String merk) {
        super(nomor, tahun, merk);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Kategori: Minibus");
    }

    public int biayaSewa(int lamaSewa) {
        int result = 5000000;
        if (lamaSewa > 5) {
            result += 500000 * (lamaSewa - 5);
        }
        return result - calculateDiscount(result, lamaSewa);
    }

    public int calculateDiscount(int result, int lamaSewa) {
        if (lamaSewa > 10) return result/10;
        else return 0;
    }
}