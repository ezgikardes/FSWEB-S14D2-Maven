package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");
        Ceiling ceiling = new Ceiling(2, PaintColor.GREEN);
        Carpet carpet = new Carpet(120, 80, PaintColor.WHITE);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 3);
        Bed bed = new Bed("double", 2, 100, 2, 1);
        Wardrobe wardrobe = new Wardrobe(1, 1, 10.0);

        Bedroom bedroom = new Bedroom("child", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        System.out.println(bedroom);
    }
}