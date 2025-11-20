package lab24.factory;

import lab24.chairs.FunctionalChair;
import lab24.chairs.MagicChair;
import lab24.chairs.VictorianChair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
