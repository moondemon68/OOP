class RekeningDeposito extends Rekening {
	protected int bulan;
	public RekeningDeposito(String nama, double saldo) {
		super(nama, saldo, 0.15);
		this.bulan = 0;
	}

	public void setor(double x) {
		System.out.println("Tidak dapat melakukan penyetoran uang untuk rekening ini.");
	}

	public void tarik(double x) {
		System.out.println("Tidak dapat melakukan penarikan uang sebagian untuk rekening ini.");
	}

	public void update() {
		this.bulan++;
		if (this.bulan % 12 == 0) {
			this.saldo += (this.getSukuBunga() * this.saldo - this.hitungBiaya());
		} else {
			this.saldo -= this.hitungBiaya();
		}
	}

	public void tarik() {
		if (this.bulan < 12) {
			double pen = 0.2 * this.saldo;
			System.out.println("Anda terkena penalti sebesar " + pen + ".");
		}
		this.saldo = 0;
	}
}