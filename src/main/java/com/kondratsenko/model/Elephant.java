package com.kondratsenko.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Elephant extends Animal{
    private int width;
    private Set<String>zooElephant;

    public Elephant(int id, String name, int age, int weight, int width, Set<String> zooElephant) {
        super(id, name, age, weight);
        this.width = width;
        this.zooElephant = zooElephant;
    }
}
