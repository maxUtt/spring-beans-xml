package com.kondratsenko.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Dog extends Animal {
    private int height;
    private Map<String, Integer> locationAndPriceDog;

    public Dog(int id, String name, int age, int weight, int height, Map<String, Integer> locationAndPriceDog) {
        super(id, name, age, weight);
        this.height = height;
        this.locationAndPriceDog = locationAndPriceDog;
    }
}
