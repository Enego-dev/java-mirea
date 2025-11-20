package lab24;

import lab24.chairs.Chair;
import lab24.chairs.FunctionalChair;
import lab24.factory.ChairFactory;

public class Client {
    static void main() {
        Chair chair;
        var chairFactory = new ChairFactory();

        chair = chairFactory.createVictorianChair(10);
        chair.sit();

        chair = chairFactory.createMagicChair();
        chair.sit();

        chair = chairFactory.createFunctionalChair();
        chair.sit();
        IO.println("5 + 1 = " + ((FunctionalChair) chair).sum(5, 1));
    }
}
