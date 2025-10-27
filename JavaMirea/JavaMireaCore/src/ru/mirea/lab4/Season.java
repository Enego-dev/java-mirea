package ru.mirea.lab4;

public enum Season {
    Winter(0, -6.4f),
    Spring(1, 8.5f),
    Summer(2, 20f){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    Autumn(3, 9.5f);

    private final int levelCode;
    private final float averageTemperature;

    private Season(int levelCode, float averageTemperature){
        this.levelCode = levelCode;
        this.averageTemperature = averageTemperature;
    }

    public int getLevelCode(){
        return levelCode;
    }

    public float getAverageTemperature(){
        return averageTemperature;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
