package achievement;

public class Badge extends Achievement {
    private String objective;


    public Badge(String name, String objective) {
        this.name = name;
        this.objective = objective;
    }
    
    public String getName() {
        return name;
    }

    public String getObjective() { 
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    } 
    
}
