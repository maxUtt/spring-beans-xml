package com.kondratsenko;

import com.kondratsenko.model.Cat;
import com.kondratsenko.model.Dog;
import com.kondratsenko.model.Elephant;
import com.kondratsenko.model.Zoo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class App
{
    public static void main( String[] args )
    {
        Cat sonya = new Cat(1, "Sonya", 4, 2,25, List.of("fish", "meat", "bird"));
        Cat tom = new Cat(2, "Tom", 6, 3,30, List.of("Hill's Science", "Optimeal ", "BrooksField Low"));
        Cat atos = new Cat(3, "Atos", 3, 5,35, List.of("Nature's Protection", "Winner ", "Trainer Natural"));
        Dog elay = new Dog(1, "Elay", 7, 10, 70, Map.of("Gomel" ,120, "Minsk",350, "Braslav", 455));
        Dog enda = new Dog(2, "Enda", 9, 15, 90, Map.of("Vitebsk" ,120, "Minsk",350, "Moscow", 455));
        Dog bruno = new Dog(3, "Bruno", 8, 13, 85, Map.of("Moscow" ,120, "Minsk",350, "Peterburg", 455));
        Elephant jumbo = new Elephant(1, "Jumbo",25,1200,250, Set.of("London Zoo", "Prague Zoo", "Berlin Zoo"));
        Zoo myZoo = new Zoo(1, "myZoo", List.of(sonya,tom, atos), List.of(elay, enda, bruno), jumbo);

        myZoo.print();
    }
}
