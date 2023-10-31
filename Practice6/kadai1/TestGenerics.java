package kadai1;

public class TestGenerics {
    public static void main(String[] args){
        Generics<String> a = new Generics<String>();
        a.setMyField("hoge");
        System.out.println(a.getMyField());

        Generics<Integer> b = new Generics<Integer>();
        b.setMyField(123);
        System.out.println(b.getMyField());
    }
}
