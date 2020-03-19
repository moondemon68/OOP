class Goose {
    private String name;
    private int honk;

    public Goose() {
        this.name = "Horrible";
        this.honk = 1;
    }

    public Goose(String name, int honk) {
        this.name = name;
        this.honk = honk;
    }

    public void steal(String thing) {
        System.out.println(this.name + " steals " + thing);
    }

    public String toString() {
        String ret = "";
        ret += (this.name + " goose says ");
        for (int i = 1; i <= this.honk; i++) {
            ret += ("honk");
            if (i < this.honk) ret += (" ");
        }
        return ret;
    }
}