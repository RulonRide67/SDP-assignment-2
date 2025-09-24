package Furniture;

import Furniture.Factory.*;
import Furniture.Product.*;

public class Demo {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sit();
        sofa.lieOn();

        System.out.println("\n");

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        victorianChair.sit();
        victorianSofa.lieOn();
    }
}
