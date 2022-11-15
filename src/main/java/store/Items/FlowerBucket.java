package store.Items;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import store.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends Item{
    @Getter @Setter
    private List<Flower> flowers = new ArrayList<>();

    public boolean searchFlower(Flower flower){
        return flowers.contains(flower);
    }
    public void add(Flower flower) {
        flowers.add(flower);
    }
    @Override
    public double price() {
        double result = 0;
        for (Flower flower : flowers) {
            result += flower.getPrice();
        }

        return result;
    }
}
