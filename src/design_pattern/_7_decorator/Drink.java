package design_pattern._7_decorator;

public abstract class Drink {
    private String des;
    private Float cost;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public abstract Float calCost();
}
