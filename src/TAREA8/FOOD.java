package TAREA8;
public class FOOD {
    private String name;
    private boolean processed;

    public FOOD() {
    }

    public FOOD(String name, boolean processed) {
        this.name = name;
        this.processed = processed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    @Override
    public String toString() {
        return "FOOD{" +
                "name='" + name + '\'' +
                ", processed=" + processed +
                '}';
    }
}
