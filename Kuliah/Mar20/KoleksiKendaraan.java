class KoleksiKendaraan {
    private Kendaraan[] Koleksi;
    private int neff;
    private int size;

    public KoleksiKendaraan() {
        this.Koleksi = new Kendaraan[100];
        this.neff = 0;
        this.size = 100;
    }

    public KoleksiKendaraan(int size) {
        this.Koleksi = new Kendaraan[size];
        this.neff = 0;
        this.size = size;
    }

    public Kendaraan getKendaraanAt(int idx) {
        return this.Koleksi[idx];
    }

    public void printAll() {
        for (int i = 0; i < this.neff; i++) {
            System.out.println("Kendaraan " + (i + 1));
            this.Koleksi[i].printInfo();
            System.out.println();
        }
    }

    public void add(Kendaraan K) {
        this.Koleksi[this.neff] = K;
        this.neff++;
    }

    public void add(KoleksiKendaraan K) {
        for (int i = 0; i < K.neff; i++) {
            this.Koleksi[this.neff] = K.Koleksi[i];
            this.neff++;
        }
    }
}