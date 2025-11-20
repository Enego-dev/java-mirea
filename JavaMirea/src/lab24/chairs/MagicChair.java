package lab24.chairs;

public class MagicChair implements Chair{
    public void doMagic(){
        IO.println("Магический стул превратил вас в бульбу(");
    }

    @Override
    public void sit() {
        IO.println("Кажется, вы сели на обычный стул.");
        doMagic();
    }
}
