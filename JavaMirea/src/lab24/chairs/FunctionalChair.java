package lab24.chairs;

public class FunctionalChair implements Chair{
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void sit() {
        IO.println("Вы сели на калькулятор! Воспользуйтесь им, когда потребуется))) (можно даже не вставая)");
    }
}
