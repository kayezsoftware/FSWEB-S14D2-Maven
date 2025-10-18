package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 1, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(2, 3, 60.5);
        Carpet carpet = new Carpet(4, 3, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Yalçın’s Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}