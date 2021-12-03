package com.kondratsenko.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Animal implements Printable{
    protected int id;
    protected String name;
    protected int age;
    protected int weight;
}
