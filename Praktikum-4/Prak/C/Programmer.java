class Programmer extends Employee {
    public Programmer() {
        super();
    }

    public int calculateSalary(int workHour) {
        int ret = 0;
        if (this.hasMarried == true) {
            ret += 4000000;
        }
        for (int i = 1; i <= workHour; i++) {
            if (i <= 150) ret += 100000;
            else ret += 10000;
        }
        return ret;
    }
}