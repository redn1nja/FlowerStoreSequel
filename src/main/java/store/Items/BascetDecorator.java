package store.Items;

public class BascetDecorator extends ItemDecorator{
    private Item item;
    public BascetDecorator(Item item) {
        this.item = item;
    }
    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return "bascet decorator";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
