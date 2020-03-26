import java.util.List;

public class Test {
    private List<Integer> list;
    private int n;

    public Test(List<Integer> list, int n) {
        this.list = list;
        this.n = n;
    }

    public void reset() {
        this.list.clear();
        for (int i=1;i<=this.n;i++) this.list.add(0);
    }

    public long get(int idx) {
        this.reset();
        long start = Util.getTime();
        Integer x = this.list.get(idx);
        long end = Util.getTime();
        return end - start;
    }

    public long del(int idx, int t) {
        this.reset();
        long start = Util.getTime();
        for (int i=1;i<=t;i++) this.list.remove(idx);
        long end = Util.getTime();
        return end - start;
    }
}