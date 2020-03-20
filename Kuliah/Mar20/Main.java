class Main {
    public static void main(String[] args) {
        KoleksiKendaraan K = new KoleksiKendaraan();
        K.add(new Bus());
        K.add(new Minibus());
        K.add(new Mobil());
        
        KoleksiKendaraan L = new KoleksiKendaraan(3);
        L.add(new Bus(309, 2020, "Honda", 30));
        L.add(new Minibus(15, 2017, "Range Rover"));
        L.add(new Mobil(25, 2018, "Ferrari", "Ojan"));

        K.add(L);
        K.printAll();

        System.out.print("Sewa bus 5 hari: ");
        System.out.println(L.getKendaraanAt(0).biayaSewa(5));
        System.out.print("Sewa minibus 5 hari: ");
        System.out.println(L.getKendaraanAt(1).biayaSewa(5));
        System.out.print("Sewa mobil 5 hari: ");
        System.out.println(L.getKendaraanAt(2).biayaSewa(5));

        System.out.print("Sewa bus 15 hari: ");
        System.out.println(L.getKendaraanAt(0).biayaSewa(15));
        System.out.print("Sewa minibus 15 hari: ");
        System.out.println(L.getKendaraanAt(1).biayaSewa(15));
        System.out.print("Sewa mobil 15 hari: ");
        System.out.println(L.getKendaraanAt(2).biayaSewa(15));
    }
}