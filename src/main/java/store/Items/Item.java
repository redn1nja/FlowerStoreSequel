package store.Items;

import lombok.Getter;

public abstract class Item {
    @Getter
    private String description;
    public abstract double price();
}
