package achievement;

public class Badge extends Achievement {


    public Badge(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public int getTotalPoints() {
        return 0;
    }
    
}
