package com.kondratsenko.model;

public interface Printable {
    default void print(){
        System.out.println(this);
    }
}
