class RekeningTabungan extends Rekening {
	public RekeningTabungan(String nama, double saldo) {
		super(nama, saldo, 0.05);
	}

	public void setor(double x) {
		this.saldo += x;
	}

	public void tarik(double x) {
		if (this.saldo >= x) {
			this.saldo -= x;
		}
	}

	public void update() {
		this.saldo += (this.getSukuBunga() * this.saldo - this.hitungBiaya());
	}
}