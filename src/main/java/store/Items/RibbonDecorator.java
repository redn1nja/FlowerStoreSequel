package store.Items;

public class RibbonDecorator extends ItemDecorator{

    private Item item;
    public RibbonDecorator(Item item){
        this.item = item;
    }
    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return "ribbon decorator";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
