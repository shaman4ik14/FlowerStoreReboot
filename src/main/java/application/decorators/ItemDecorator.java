package application.decorators;

import application.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
}
