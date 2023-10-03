public class StringSample {
    public static void main(String[] args) {
        String str = "INIAD";
        int len = str.length();
        String lower = str.toLowerCase();
        System.out.println(lower);
        String fstr = String.format("Length of %s: %d", str, len);
        System.out.println(fstr);
    }
}