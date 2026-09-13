package achievement;

public class Points extends Achievement {
    private int points;

    public Points(String name, int quantity) {
        this.name = name;
        this.points = quantity;
    }

    public String getName() {
        return "Points " + name;
    }

    public int getQ() {
        return points;
    }

    public void setQ(int q) {
        this.points = q;
    }
    
    
}
