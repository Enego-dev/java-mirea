package lab11;

public enum StudentFormatDate {
    Short(0),
    Middle(1),
    Long(2);

    private final int type;

    private StudentFormatDate(int type){
        this.type = type;
    }

    public int getType(){
        return type;
    }
}
