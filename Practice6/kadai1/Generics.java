package kadai1;

public class Generics<T> {
    private T myField;
    public void setMyField(T val){
        this.myField = val;
    }
    public T getMyField(){
        return this.myField;
    }
}
