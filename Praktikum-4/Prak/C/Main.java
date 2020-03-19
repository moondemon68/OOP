class Main {
    public static void main(String[] args) {
        Programmer A = new Programmer();
        System.out.println(A.calculateSalary(100));
        System.out.println(A.calculateSalary(300));
        A.setHasMarried(true);
        System.out.println(A.calculateSalary(100));
        System.out.println(A.calculateSalary(300));
    }
}