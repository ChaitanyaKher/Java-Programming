package edX;

public class Item {
    private int value;
    private int weight;
    private double profit;
    private boolean isLooted;
    public Item(){
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit() {
        this.profit = (double) this.value/this.weight;
    }

    public boolean isLooted() {
        return isLooted;
    }

    public void setLooted(boolean looted) {
        isLooted = looted;
    }

    @Override
    public String toString(){
        return "Item weight: "+ this.weight+"\nItem Value: "+this.value+"\nItem Profit: "+this.profit+"\nIs Item looted: "+this.isLooted+"\n";
    }
}
