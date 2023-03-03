package day6;

public class State extends Country{
    private String stateName;
    private String language;

    public String getStateName() {
        return stateName;
    }
    public String getLanguage() {
        return language;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public String toString() {
        return "State [stateName=" + stateName + ", language=" + language + "]";
    } 
}
