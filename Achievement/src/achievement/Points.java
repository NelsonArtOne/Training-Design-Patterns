package achievement;

public class Points extends Achievement {
    private int q;

    public Points(String name, int quantity) {
        this.name = name;
        this.q = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
    
    
}
