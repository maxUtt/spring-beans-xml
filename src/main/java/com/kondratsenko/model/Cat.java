package com.kondratsenko.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Cat extends Animal{
    private int length;
    private List<String> foodCat;

    public Cat(int id, String name, int age, int weight, int length, List<String> foodCat) {
        super(id, name, age, weight);
        this.length = length;
        this.foodCat = foodCat;
    }
}
