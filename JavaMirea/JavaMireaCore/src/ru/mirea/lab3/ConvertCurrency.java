package ru.mirea.lab3;

public class ConvertCurrency {
    private float exchange = 80;

    public float getExchange(){
        return exchange;
    }

    private void setExchange(float value){
        exchange = value;
    }

    public float getRuble(float USdollarCount){
        return USdollarCount * exchange;
    }

    public float getDollar(float RubleCount){
        return RubleCount / exchange;
    }
}
