package Furniture.Factory;

import Furniture.Product.Chair;
import Furniture.Product.Sofa;

public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();
}
