class StackMain {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(2);
		s1.push(3);
		System.out.println(s1.pop());
		int[] a = new int[2];
		a[0] = 4;
		a[1] = 5;
		s1.push(a);
		System.out.println(s1.pop());
		System.out.println(s1.pop());

		// no cctor
	}
}