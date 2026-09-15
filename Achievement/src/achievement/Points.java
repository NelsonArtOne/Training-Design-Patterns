package achievement;

public class Points extends Achievement {
    private int points;
    private int totalPoints;

    public Points(String name, int quantity) {
        this.name = name;
        this.points = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPointsQuantity() {
        return points;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    
    
}
