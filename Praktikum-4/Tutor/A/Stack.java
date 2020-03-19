class Stack {
	private int size;
	private int capacity;
	private int[] data;

	public Stack() {
		this.size = 0;
		this.capacity = 10;
		this.data = new int[this.capacity];
	}

	public Stack(int cap) {
		this.size = 0;
		this.capacity = cap;
		this.data = new int[this.capacity];
	}

	public void push(int x) {
		if (this.size < this.capacity) {
			this.data[this.size] = x;
			this.size++;
		}
	}

	public void push(int[] x) {
		for (int i=0;i<x.length;i++) {
			if (this.size < this.capacity) {
				this.data[this.size] = x[i];
				this.size++;
			}
		}
	}

	public int pop() {
		int ret = 0;
		if (this.size > 0) {
			this.size--;
			ret = this.data[this.size];
		}
		return ret;
	}
}