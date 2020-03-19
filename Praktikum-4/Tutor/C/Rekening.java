abstract class Rekening {
	protected String nama;
	protected double saldo;
	protected double sukuBunga;

	public Rekening(String nama, double saldo, double sukuBunga) {
		this.nama = nama;
		if (saldo < 0) {
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
		this.sukuBunga = sukuBunga;
	}

	abstract public void setor(double x);
	abstract public void tarik(double x);
	abstract public void update();

	public double hitungBiaya() {
		if (0.1 * this.saldo > 10) {
			return 10;
		} else {
			return 0.1 * this.saldo;
		}
	}

	public String getNama() {
		return this.nama;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double getSukuBunga() {
		return this.sukuBunga;
	}
}