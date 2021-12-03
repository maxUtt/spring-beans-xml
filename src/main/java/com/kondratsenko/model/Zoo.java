package com.kondratsenko.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Zoo implements Printable{
    private int id;
    private String name;
    private List<Cat> catList;
    private List<Dog> dogList;
    private Elephant elephant;

    @Override
    public String toString() {
        return "Zoo " + "id=" + id + ", name='" + name + '\'' +
                "\ncatList=" + catList +
                "\ndogList=" + dogList +
                "\nelephant=" + elephant +
                '}';
    }

    public void start(){
        System.out.println("Zoo " + name + " has been started");
    }

    public void finish(){
        System.out.println("Zoo " + name + " has been finished");
    }
}
