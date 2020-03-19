class RekeningGiro extends Rekening {
	protected boolean penalti;

	public RekeningGiro(String nama, double saldo) {
		super(nama, saldo, 0.07);
		this.penalti = false;
		if (this.saldo < 500) {
			this.penalti = true;
		}
	}

	public void setor(double x) {
		this.saldo += x - 0.1;
		if (this.saldo < 500) {
			this.penalti = true;
		}
	}

	public void tarik(double x) {
		if (this.saldo > x + 0.1) {
			this.saldo -= x + 0.1;
		}
		if (this.saldo < 500) {
			this.penalti = true;
		}
	}

	public void update() {
		this.saldo += this.getSukuBunga() * this.saldo - this.hitungBiaya();
		if (this.penalti == true) {
			this.saldo -= 10;
		}
		if (this.saldo > 500) {
			this.penalti = false;
		}
		if (this.saldo < 0) {
			this.saldo = 0;
		}
	}
}