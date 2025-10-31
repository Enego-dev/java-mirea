package lab3.stringformatting.task1;

public class ConvertCurrency {
    private float exchange = 80;

    public float getExchange(){
        return exchange;
    }

    private void setExchange(float value){
        exchange = value;
    }

    public float getRuble(float dollarCount){
        return dollarCount * exchange;
    }

    public float getDollar(float rubleCount){
        return rubleCount / exchange;
    }
}
