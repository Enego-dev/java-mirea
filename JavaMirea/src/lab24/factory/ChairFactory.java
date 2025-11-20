package lab24.factory;

import lab24.chairs.FunctionalChair;
import lab24.chairs.MagicChair;
import lab24.chairs.VictorianChair;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
