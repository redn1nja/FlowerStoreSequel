package store.flowers;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter @ToString
public class Flower {
    @Getter
    private double sepalLength;
    @Getter
    private String color;
    @Getter
    private double price;

}
