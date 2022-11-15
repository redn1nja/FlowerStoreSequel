package store.Items;

public class PaperDecorator extends ItemDecorator{
    private Item item;
    public PaperDecorator(Item item) {
        this.item = item;
    }
    @Override
    public double price() {
        return 13+ item.price();
    }

    @Override
    public String getDescription() {
        return "Paper decorator";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
