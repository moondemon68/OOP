class SummonedMonster implements ISummoned {
    private Monster monster;
    private boolean terbuka;
    private boolean menyerang;

    public SummonedMonster(Monster monster, boolean terbuka, boolean menyerang) {
        this.monster = monster;
        this.terbuka = terbuka;
        this.menyerang = menyerang;
    }

    public boolean flip() {
        if (this.terbuka == false) {
            this.terbuka = true;
            return true;
        } else {
            return false;
        }
    }

    public void rotate() {
        if (this.menyerang == true) {
            this.menyerang = false;
        } else {
            this.menyerang = true;
        }
    }

    public int getPositionValue() {
        if (this.menyerang == true) {
            return this.monster.getAttackValue();
        } else {
            return this.monster.getDefenseValue();
        }
    }

    public void render() {
        System.out.print("Monster " + this.monster.getName() + " dalam keadaan ");
        if (this.terbuka == false) System.out.print("tertutup");
        else System.out.print("terbuka");
        System.out.print(" dengan posisi ");
        if (this.menyerang == false) System.out.println("bertahan");
        else System.out.println("menyerang");
    }
}