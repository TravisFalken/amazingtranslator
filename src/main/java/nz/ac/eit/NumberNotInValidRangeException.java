package nz.ac.eit;

public class NumberNotInValidRangeException extends Exception {
    private int value;

    public NumberNotInValidRangeException(int value){
        this.value = value;
    }
    @Override
    public String getMessage() {
        return "This number you have typed "+value+" is not in the range given (1 - 30)";
    }
}
