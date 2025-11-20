package lab24.chairs;

public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public void sit() {
        IO.println("Вы сидите на викторианском стуле " + getAge() + "-летней давности!");
    }
}
