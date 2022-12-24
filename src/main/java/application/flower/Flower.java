package application.flower;
import application.item.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower extends Item {
    @Id @GeneratedValue @Getter @Setter
    private int id;
    @Getter @Setter
    private String color;
    @Getter @Setter
    private double petal;
    @Getter
    private double price;

    @Override
    public double price() {
        return price;
    }
}
