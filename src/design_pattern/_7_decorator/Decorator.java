package design_pattern._7_decorator;

public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public Float calCost() {
        //drink类中所包含的价格  +  本商品的价格
        return drink.calCost()+super.getCost();
    }

    @Override
    public String getDes() {
        return "本商品:"+super.getDes()+" "+super.getCost()+"&&原有商品:"+drink.getDes()+" "+drink.getCost();
    }
}
