abstract class Employee {
    protected boolean hasMarried;

    public Employee() {
        this.hasMarried = false;
    }

    public void setHasMarried(boolean hasMarried) {
        this.hasMarried = hasMarried;
    }

    abstract public int calculateSalary(int workHour);
}